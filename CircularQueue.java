class CircularQueue {
    public static void main(String[] args) {
        Circular obj = new Circular();
        obj.enque(12);
        obj.enque(14);
        obj.enque(15);
        obj.enque(16);
        obj.enque(17);
        System.out.println("dequeue element is : " + obj.dequeue());
        System.out.println("dequeue element is : " + obj.dequeue());
        System.out.println("dequeue element is : " + obj.dequeue());
        System.out.println("dequeue element is : " + obj.dequeue());
        System.out.println("dequeue element is : " + obj.dequeue());
        obj.enque(12);
        obj.enque(11);
        obj.enque(19);
        obj.enque(23);
        obj.enque(29);
        obj.enque(2);
        obj.enque(42);
        obj.enque(72);
        obj.enque(92);
        obj.enque(28);
        System.out.println("dequeue element is : " + obj.dequeue());
        System.out.println("dequeue element is : " + obj.dequeue());
        System.out.println("dequeue element is : " + obj.dequeue());
        System.out.println("dequeue element is : " + obj.dequeue());
        System.out.println("dequeue element is : " + obj.dequeue());
        System.out.println("dequeue element is : " + obj.dequeue());
        System.out.println("dequeue element is : " + obj.dequeue());
        System.out.println("dequeue element is : " + obj.dequeue());
        System.out.println("dequeue element is : " + obj.dequeue());
        System.out.println("dequeue element is : " + obj.dequeue());

        // <--------------- Only one statement executable ------------------->

        if (obj.isEmpty()) {
            System.out.println("Queue is Empty");
        }
        if (obj.isFull()) {
            System.out.println("Queue is Full");
        }
    }
}

class Circular {
    int arr[] = new int[11];
    int maxsize = arr.length;
    int rear = 0;
    int front = 0;

    boolean isFull() {
        if ((rear + 1) % maxsize == front) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (rear == front) {
            return true;
        } else {
            return false;
        }
    }

    void enque(int value) {
        if (!isFull()) {
            rear = (rear + 1) % maxsize;
            arr[rear] = value;
            System.out.println("Enque element is : " + value);
        } else {
            System.out.println("Queue overflow");
        }
    }

    int dequeue() {
        int temp = -1;
        if (isEmpty()) {
            System.out.println("Queue underflow");
        } else {
            front = (front + 1) % maxsize;
            temp = arr[front];
        }
        return temp;
    }
}