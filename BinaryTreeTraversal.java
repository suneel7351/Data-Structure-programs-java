
class BinaryTreeTraversal {

    public static void main(String[] args) {
        BinaryTree obj = new BinaryTree();
        Node root = obj.CreatNode(4);
        Node p1 = obj.CreatNode(1);
        Node p2 = obj.CreatNode(6);
        Node p3 = obj.CreatNode(5);
        Node p4 = obj.CreatNode(2);
        root.left = p1;
        root.right = p2;
        p1.left = p3;
        p1.right = p4;
        System.out.println("PreOrder");
        obj.preOrder(root);
        System.out.println("PostOrder");
        obj.postOrder(root);
        System.out.println("InOrder");
        obj.inOrder(root);
    }
}

class Node {
    int data;
    Node left;
    Node right;
}

class BinaryTree {
    Node CreatNode(int element) {
        Node n = new Node();
        n.data = element;
        n.left = null;
        n.right = null;
        return n;
    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
}