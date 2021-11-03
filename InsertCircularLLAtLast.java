class InsertCircularLLAtLast {
    public static void main(String[] args) {
        LinkList obj = new LinkList();
        System.out.println("Before Inserting");
        obj.display();
        System.out.println("After Inserting");
        obj.insert(12);
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
    Node seventh = new Node();

    LinkList() {
        head.data = 1;
        head.next = second;
        second.data = 2;
        second.next = third;
        third.data = 3;
        third.next = fourth;
        fourth.data = 4;
        fourth.next = fifth;
        fifth.data = 5;
        fifth.next = sixth;
        sixth.data = 6;
        sixth.next = seventh;
        seventh.data = 7;
        seventh.next = head;
    }

    void insert(int value) {
        Node ptr = new Node();
        Node p = head;
        ptr.data = value;
        while (p.next != head) {
            p = p.next;
        }
        p.next = ptr;
        ptr.next = head;
    }

    void display() {
        Node ptr = head;
        do {
            System.out.println("Element : " + ptr.data);
            ptr = ptr.next;
        } while (ptr != head);
    }
}