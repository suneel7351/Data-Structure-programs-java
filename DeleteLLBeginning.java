class DeleteLLBeginning {
    public static void main(String[] args) {
        LinkList obj = new LinkList();
        System.out.println("Before Deleting LinkList");
        obj.display();
        System.out.println("After Deleting LinkList");
        obj.delete();
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
        head.data = 5;
        head.next = second;
        second.data = 2;
        second.next = third;
        third.data = 4;
        third.next = fourth;
        fourth.data = 9;
        fourth.next = fifth;
        fifth.data = 8;
        fifth.next = sixth;
        sixth.data = 12;
        sixth.next = seventh;
        seventh.data = 14;
        seventh.next = null;
    }

    void delete() {
        if (head == null) {
            System.out.println("LinkList is Empty");
        } else {
            Node temp = head;
            head = head.next;
            temp = null;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Element : " + temp.data);
            temp = temp.next;
        }
    }
}