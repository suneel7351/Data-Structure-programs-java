class Queue {
    public static void main(String[] args) {
        int arr[] = new int[10];
        QueueOperations obj = new QueueOperations();
        obj.enque(arr, 12);
        obj.enque(arr, 1);
        obj.enque(arr, 2);
        obj.enque(arr, 3);
        obj.enque(arr, 4);
        System.out.println("dequeue elelment is " + obj.dequeue(arr));
        System.out.println("dequeue elelment is " + obj.dequeue(arr));
        System.out.println("dequeue elelment is " + obj.dequeue(arr));
        System.out.println("dequeue elelment is " + obj.dequeue(arr));
        System.out.println("dequeue elelment is " + obj.dequeue(arr));
        obj.enque(arr, 12);
        obj.enque(arr, 34);
        obj.enque(arr, 90);
        obj.enque(arr, 15);
        obj.enque(arr, 14);
        System.out.println("dequeue elelment is " + obj.dequeue(arr));
        System.out.println("dequeue elelment is " + obj.dequeue(arr));
        System.out.println("dequeue elelment is " + obj.dequeue(arr));
        System.out.println("dequeue elelment is " + obj.dequeue(arr));
        System.out.println("dequeue elelment is " + obj.dequeue(arr));

        // <--------------- In this case Queue is Empty but Both statements executabl ------------------->
        // <-----------This is the Drawback of Linear Queue --------------->

        if (obj.isEmpty()) {
            System.out.println("Queue is Empty");
        }
        if (obj.isFull(arr)) {
            System.out.println("Queue is Full");
        }
    }
}

class QueueOperations {
    int front = -1, rear = -1;

    boolean isFull(int arr[]) {
        if (rear == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (front == rear) {
            return true;
        } else {
            return false;
        }
    }

    void enque(int arr[], int value) {
        if (!isFull(arr)) {
            rear++;
            arr[rear] = value;
            System.out.println("Enque element is " + value);
        } else {
            System.out.println("Queue is Full");
        }
    }

    int dequeue(int arr[]) {
        int temp = -1;
        if (!isEmpty()) {
            front++;
            temp = arr[front];
        } else {
            System.out.println("Queue is Empty");
        }
        return temp;
    }
}