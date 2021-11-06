class DeleteCircularLLBtw {

    public static void main(String[] args) {
        LinkList obj = new LinkList();
        System.out.println("Before Deleting");
        obj.display();
        System.out.println("After Deleting");
        obj.delete(3);
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

    void delete(int index) {
        Node ptr = head;
        Node q = head.next;
        int i = 0;
        if (index != 0) {
            while (i != index - 1) {
                ptr = ptr.next;
                q = q.next;
                i++;
            }
            ptr.next = q.next;
            ptr = null;
            q = null;
        } else {
            while (ptr.next != head) {
                ptr = ptr.next;
            }
            ptr.next = head.next;
            head = head.next;
            ptr = null;
        }
    }

    void display() {
        Node ptr = head;
        do {
            System.out.println("Elemnt : " + ptr.data);
            ptr = ptr.next;
        } while (ptr != head);
    }
}