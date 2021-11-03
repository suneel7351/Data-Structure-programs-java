class InsertCircularLLAfterNode {
    public static void main(String[] args) {
        LinkList obj = new LinkList();
        System.out.println("Before Inserting");
        obj.display();
        System.out.println("After Inserting");
        obj.insert(12, obj.second);
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
        sixth.next = head;
    }

    void insert(int value, Node previousNode) {
        Node ptr = new Node();
        ptr.data = value;
        ptr.next = previousNode.next;
        previousNode.next = ptr;
    }

    void display() {
        Node ptr = head;
        do {
            System.out.println("Element : " + ptr.data);
            ptr = ptr.next;
        } while (ptr != head);
    }
}