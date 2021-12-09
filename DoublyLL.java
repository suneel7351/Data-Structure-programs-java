class DoublyLL {
    public static void main(String[] args) {
        LinkList obj = new LinkList();
        System.out.println("Before Inserting");
        obj.display();
        System.out.println("AftervInserting Element at Beginning");
        obj.InsertAtBeginning(10);
        obj.InsertAtBeginning(14);
        obj.InsertAtBeginning(19);
        obj.display();
        System.out.println("After Inserting Element at Last");
        obj.InsertAtLast(29);
        obj.InsertAtLast(39);
        obj.display();
        System.out.println("After Inserting Element at given Index");
        obj.InsertAtIndex(15, 1);
        obj.InsertAtIndex(21, 2);
        obj.InsertAtIndex(23, 3);
        obj.display();
        obj.DeleteAtBegin();
        System.out.println("After Deletion At Begin");
        obj.display();
        System.out.println("After Deletion At Last");
        obj.DeleteAtLast();
        obj.display();
        System.out.println("After Deletion At index");
        obj.DelteAtIndex(3);
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

    LinkList() {
        head.data = 5;
        head.prev = null;
        head.next = null;
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

    void DeleteAtBegin() {
        if (head == null) {
            System.out.println("Linklist is empty");
        } else {
            head = head.next;
            head.next.prev = null;
        }
    }

    void DelteAtIndex(int position) {
        int i = 0;
        Node temp = head;
        Node p = head.next;
        while (i != position - 1) {
            temp = temp.next;
            i++;
        }
        p.next = temp.next;
    }

    void DeleteAtLast() {
        if (head == null) {
            System.out.println("Linklist is empty");
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.prev.next = null;
        }
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