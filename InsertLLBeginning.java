class InsertLLBeginning {
    public static void main(String[] args) {
        LinkList obj = new LinkList();
        obj.insert(45);
        obj.insert(30);
        obj.insert(13);
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

    void insert(int element) {
        Node insert = new Node();
        if (head == null) {
            head = insert;
        } else {
            insert.data = element;
            insert.next = head;
            head = insert;
        }
    }

    void display() {
        while (head != null) {
            System.out.println("Element : " + head.data);
            head = head.next;
        }
    }
}