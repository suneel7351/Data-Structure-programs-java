class IsBST {
    public static void main(String[] args) {
        BST obj = new BST();
        Node root = obj.CreatNode(5);
        Node p1 = obj.CreatNode(3);
        Node p2 = obj.CreatNode(6);
        Node p3 = obj.CreatNode(1);
        Node p4 = obj.CreatNode(4);
        root.left = p1;
        root.right = p2;
        p1.left = p3;
        p1.right = p4;
        System.out.println("Inorder");
        obj.inOrder(root);
        // obj.isBST(root);
        System.out.println(obj.isBST(root));
    }
}

class Node {
    int data;
    Node left;
    Node right;
}

class BST {
    Node CreatNode(int element) {
        Node n = new Node();
        n.data = element;
        n.left = null;
        n.right = null;
        return n;
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    boolean isBST(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.left.data > root.data) {
            return false;
        }
        if (root.right != null && root.right.data < root.data) {
            return false;
        }
        if (!isBST(root.left) || !isBST(root.right)) {
            return false;
        }
        return true;
    }
}
