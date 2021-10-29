class InsertLLBtw {
    public static void main(String[] args) {

        LinkList obj = new LinkList();
        obj.insert(92, 6);
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
        head.data = 12;
        head.next = second;
        second.data = 19;
        second.next = third;
        third.data = 67;
        third.next = fourth;
        fourth.data = 14;
        fourth.next = fifth;
        fifth.data = 56;
        fifth.next = sixth;
        sixth.data = 36;
        sixth.next = null;
    }

    void insert(int element, int index) {
        Node insert = new Node();
        Node temp = new Node();
        temp = head;
        int i = 0;
        while (i != index - 1) {
            temp = temp.next;
            i++;
        }
        insert.data = element;
        insert.next = temp.next;
        temp.next = insert;
    }

    void display() {
        while (head != null) {
            System.out.println("Element : " + head.data);
            head = head.next;
        }
    }
}