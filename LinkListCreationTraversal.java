class LinkListCreationTraversal {
    public static void main(String[] args) {
        Node head = new Node();
        Node second = new Node();
        Node third = new Node();
        Node fourth = new Node();
        Node fifth = new Node();
        Node sixth = new Node();
        Node seventh = new Node();
        head.data = 7;
        head.next = second;
        second.data = 5;
        second.next = third;
        third.data = 2;
        third.next = fourth;
        fourth.data = 34;
        fourth.next = fifth;
        fifth.data = 56;
        fifth.next = sixth;
        sixth.data = 90;
        sixth.next = seventh;
        seventh.data = 67;
        seventh.next = null;
        while (head != null) {
            System.out.println("Element : " + head.data);
            head = head.next;
        }
    }
}

class Node {
    int data;
    Node next;
}