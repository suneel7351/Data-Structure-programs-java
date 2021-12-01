class DoublyLLTraversal {
    public static void main(String[] args) {
        LinkList obj = new LinkList();
        obj.display();
    }
}

class Node {
    Node next;
    Node prev;
    int data;
}

class LinkList {
    Node head = new Node();
    Node second = new Node();
    Node third = new Node();
    Node fourth = new Node();
    Node fifth = new Node();

    LinkList() {
        head.data = 5;
        head.prev = null;
        head.next = second;
        second.data = 6;
        second.prev = head;
        second.next = third;
        third.data = 7;
        third.prev = second;
        third.next = fourth;
        fourth.data = 8;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.data = 9;
        fifth.prev = fourth;
        fifth.next = null;
    }

    void display() {
        if (head == null) {
            System.out.println("Linklist is Empty");
        } else {
            while (head != null) {
                System.out.println("Element : " + head.data);
                head = head.next;
            }
        }
    }
}