
class InsertInBST {
    public static void main(String[] args) {
        BST obj = new BST();
        Node root = obj.creatNode(50);
        Node p1 = obj.creatNode(40);
        Node p2 = obj.creatNode(60);
        Node p3 = obj.creatNode(20);
        Node p4 = obj.creatNode(45);
        Node p5 = obj.creatNode(55);
        Node p6 = obj.creatNode(70);
        root.left = p1;
        root.right = p2;
        p1.left = p3;
        p1.right = p4;
        p2.left = p5;
        p2.right = p6;
        System.out.println("Before inserting");
        obj.inOrder(root);
        System.out.println("After inserting");
        obj.insert(root, 41);
        obj.inOrder(root);
    }
}

class Node {
    int data;
    Node left;
    Node right;
}

class BST {
    Node creatNode(int element) {
        Node n = new Node();
        n.data = element;
        n.left = null;
        n.right = null;
        return n;
    }

    void insert(Node root, int key) {
        Node prev = null;
        while (root != null) {
            prev = root;
            if (root.data == key) {
                System.out.println("cannot insert " + root.data + " already in BST");
                return;
            } else if (root.data > key) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        Node ptr = creatNode(key);
        if (prev.data > key) {
            prev.left = ptr;
        } else {
            prev.right = ptr;
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