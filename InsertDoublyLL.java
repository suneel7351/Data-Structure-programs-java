class InsertDoublyLL {
    public static void main(String[] args) {
        LinkList obj = new LinkList();
        System.out.println("Before Inserting");
        obj.display();
        System.out.println("AftervInserting Element at Beginning");
        obj.InsertAtBeginning(10);
        obj.display();
        System.out.println("After Inserting Element at Last");
        obj.InsertAtLast(19);
        obj.display();
        System.out.println("After Inserting Element at given Index");
        obj.InsertAtIndex(15, 3);
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

    void InsertAtBeginning(int element) {
        Node temp = new Node();
        temp.data = element;
        temp.prev = null;
        temp.next = head;
        head.prev = temp;
        head = temp;
    }

    void InsertAtLast(int element) {
        Node temp = new Node();
        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        temp.data = element;
        ptr.next = temp;
        temp.prev = ptr;
        temp.next = null;
    }

    void InsertAtIndex(int element, int index) {
        Node temp = new Node();
        Node ptr = head;
        int i = 1;
        while (i < index - 1) {
            ptr = ptr.next;
            i++;
        }
        temp.data = element;
        temp.next = ptr.next;
        ptr.next = temp;
        temp.next.prev = temp;
        temp.prev = ptr;
    }

    void display() {
        Node ptr = head;
        if (ptr == null) {
            System.out.println("Linklist is Empty");
        } else {
            while (ptr != null) {
                System.out.println("Element : " + ptr.data);
                ptr = ptr.next;
            }
        }
    }
}