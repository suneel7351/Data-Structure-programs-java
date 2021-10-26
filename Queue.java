class Queue {
    public static void main(String[] args) {
        int arr[] = new int[10];
        QueueOperations obj = new QueueOperations();
        obj.enque(arr, 12);
        obj.enque(arr, 1);
        obj.enque(arr, 2);
        obj.enque(arr, 3);
        obj.enque(arr, 4);
        System.out.println("Deque elelment is " + obj.deque(arr));
        System.out.println("Deque elelment is " + obj.deque(arr));
        System.out.println("Deque elelment is " + obj.deque(arr));
        System.out.println("Deque elelment is " + obj.deque(arr));
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

    int deque(int arr[]) {
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