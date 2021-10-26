class Stack {
    public static void main(String ar[]) {
        StackOperaitons operation = new StackOperaitons();
        operation.push(3);
        operation.push(13);
        operation.push(30);
        operation.push(23);
        operation.push(43);
        operation.push(53);
        System.out.println("Before pop ");
        operation.display();
        System.out.println("The 2nd element is " + operation.peek(2));
        System.out.println("The topmost element is " + operation.stackTop());
        System.out.println("The bottom element is " + operation.stackBottom());
        System.out.println("After pop ");
        System.out.println("Removed element is " + operation.pop());
        operation.display();
        System.out.println("The third element is " + operation.peek(3));
        System.out.println("The topmost element is " + operation.stackTop());
        System.out.println("The bottom element is " + operation.stackBottom());
    }

}

class StackOperaitons {
    int Arr[] = new int[6];
    int top = -1;

    void push(int value) {
        if (!isFull()) {
            top++;
            Arr[top] = value;
        } else if (isFull()) {
            System.out.println("StackOverflow");
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("StackUnderflow");
            return -1;
        } else {
            int temp = Arr[top];
            top--;
            return temp;
        }
    }

    int peek(int position) {
        if (isEmpty()) {
            System.out.println("There is no element in stack");
            return -1;
        } else {
            return Arr[top - position + 1];
        }
    }

    int stackTop() {
        if (isEmpty()) {
            System.out.println("There is no element in stack");
            return -1;
        } else {
            return Arr[top];
        }
    }

    int stackBottom() {
        if (isEmpty()) {
            System.out.println("There is no element in stack");
            return -1;
        } else {
            return Arr[0];
        }
    }

    boolean isFull() {
        if (top >= Arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top < 0) {
            return true;
        } else {
            return false;
        }
    }

    void display() {
        for (int i = top; i > -1; i--) {
            System.out.println(Arr[i]);
        }
    }
}