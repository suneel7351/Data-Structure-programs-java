class DeleteLLBtw {
    public static void main(String[] args) {
        LinkList obj = new LinkList();
        System.out.println("Before Deleting");
        obj.display();
        System.out.println("After Deleting");
        obj.delete(1);
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
        head.data = 9;
        head.next = second;
        second.data = 4;
        second.next = third;
        third.data = 3;
        third.next = fourth;
        fourth.data = 2;
        fourth.next = fifth;
        fifth.data = 1;
        fifth.next = sixth;
        sixth.data = 12;
        sixth.next = null;
    }

    void delete(int index) {
        if (head == null) {
            System.out.println("LinkList is Empty");
        } else {
            if (index != 0) {
                Node temp = head;
                Node q = head.next;
                int i = 0;
                while (i != index - 1) {
                    temp = temp.next;
                    q = q.next;
                    i++;
                }
                temp.next = q.next;
                q = null;
            } else {
                Node temp = head;
                head = head.next;
                temp = null;
            }
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