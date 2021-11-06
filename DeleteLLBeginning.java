class DeleteLLBeginning {
    public static void main(String[] args) {
        LinkList obj = new LinkList();
        System.out.println("Before Deleting LinkList");
        obj.display();
        System.out.println("After Deleting LinkList");
        obj.delete();
        obj.display();
        System.out.println(obj.head);

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
        fifth.next = null;
    }

    void delete() {
        if (head != null) {
            Node temp = head;
            head = head.next;
            temp = null;
        }
    }

    void display() {
        while (head != null) {
            System.out.println("Element : " + head.data);
            head = head.next;
        }
    }
}