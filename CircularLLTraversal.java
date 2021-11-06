class CircularLLTraversal {

    public static void main(String[] args) {
        LinkList obj = new LinkList();
        obj.display();
    }
}

class Node {
    int data;
    Node next;
}

class LinkList {
    Node head = new Node();
    Node second = new Node();
    Node third = new Node();
    Node fourth = new Node();
    Node fifth = new Node();
    Node sixth = new Node();

    LinkList() {
        head.data = 5;
        head.next = second;
        second.data = 6;
        second.next = third;
        third.data = 2;
        third.next = fourth;
        fourth.data = 3;
        fourth.next = fifth;
        fifth.data = 8;
        fifth.next = sixth;
        sixth.data = 12;
        sixth.next = head;
    }

    void display() {
        if (head == null) {
            System.out.println("LinkList is Empty");
        } else {
            Node ptr = head;
            do {
                System.out.println("Element : " + ptr.data);
                ptr = ptr.next;
            } while (ptr != head);
        }
    }
}