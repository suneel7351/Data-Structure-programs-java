class DeleteLLAfterNode {
    public static void main(String[] args) {
        LinkList obj = new LinkList();
        System.out.println("Before Deleting");
        obj.display();
        System.out.println("After Deleting");
        obj.delete(obj.fourth);
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
        head.data = 2;
        head.next = second;
        second.data = 3;
        second.next = third;
        third.data = 4;
        third.next = fourth;
        fourth.data = 5;
        fourth.next = fifth;
        fifth.data = 6;
        fifth.next = sixth;
        sixth.data = 7;
        sixth.next = seventh;
        seventh.data = 8;
        seventh.next = null;
    }

    void delete(Node previousNode) {
        if (head == null) {
            System.out.println("LinkList is Empty");
        } else {
            Node q = head;
            while (previousNode.next != q) {
                q = q.next;
            }
            previousNode.next = q.next;
            q = null;

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