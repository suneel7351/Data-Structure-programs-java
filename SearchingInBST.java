class SearchingInBST {
    public static void main(String[] args) {
        BST obj = new BST();
        Node root = obj.CreatNode(50);
        Node p1 = obj.CreatNode(40);
        Node p2 = obj.CreatNode(60);
        Node p3 = obj.CreatNode(20);
        Node p4 = obj.CreatNode(45);
        Node p5 = obj.CreatNode(55);
        Node p6 = obj.CreatNode(70);
        root.left = p1;
        root.right = p2;
        p1.left = p3;
        p1.right = p4;
        p2.left = p5;
        p2.right = p6;
        Node temp = obj.searchNode(root, 20);
        if (temp != null) {
            System.out.println("Element found : " + temp.data);
        } else {
            System.out.println("Element not found");
        }
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

    Node searchNode(Node root, int key) {
        if (root == null) {
            return null;
        } else if (root.data == key) {
            return root;
        } else if (root.data > key) {
            return searchNode(root.left, key);
        } else {
            return searchNode(root.right, key);
        }
    }
}