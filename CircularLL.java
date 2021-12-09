class CircularLL {
    public static void main(String[] args) {
        Linklist obj = new Linklist();
        obj.display();
        System.out.println("After Insertion at Begin");
        obj.InsertAtBegin(6);
        obj.InsertAtBegin(23);
        obj.display();
        System.out.println("After Insertion at Last");
        obj.InsertAtLast(22);
        obj.InsertAtLast(33);
        obj.display();
        System.out.println("After Insertion at position");
        obj.InsertAtIndex(44, 3);
        obj.InsertAtIndex(55, 2);
        obj.display();
        System.out.println("After Deletion at Begin");
        obj.DeleteAtBegin();
        obj.display();
        System.out.println("After Deletion at given position");
        obj.DeleteAtPosition(3);
        obj.display();
    }
}

class Node {
    Node next;
    int data;
}

class Linklist {
    Node head = new Node();
    Node second = new Node();

    Linklist() {
        head.data = 3;
        head.next = second;
        second.data = 4;
        second.next = head;
    }

    void InsertAtBegin(int element) {
        Node ptr = new Node();
        ptr.data = element;
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        ptr.next = head;
        temp.next = ptr;
        head = ptr;
    }

    void InsertAtIndex(int element, int position) {
        Node ptr = new Node();
        ptr.data = element;
        Node temp = head;
        int i = 0;
        while (i != position - 1) {
            i++;
            temp = temp.next;
        }
        ptr.next = temp.next;
        temp.next = ptr;
    }

    void InsertAtLast(int element) {
        Node ptr = new Node();
        ptr.data = element;
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = ptr;
        ptr.next = head;
    }

    void DeleteAtBegin() {
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
    }

    // void DeleteAtLast() {
    // Node temp = head;
    // while (temp != head) {
    // temp = temp.next;
    // }

    // }
    void DeleteAtPosition(int position) {
        Node temp = head;
        Node p = head.next;
        int i = 0;
        while (i != position - 1) {
            i++;
            temp = temp.next;
        }
        p.next = temp.next;
    }

    void display() {
        Node temp = head;
        do {
            System.out.println("Elements : " + temp.data);
            temp = temp.next;
        } while (temp != head);
    }
}