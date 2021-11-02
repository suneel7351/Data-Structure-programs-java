class PostfixEvaluation {

    public static void main(String[] args) {
        char Arr[] = { 'x', '+', 'y', '*', 'z', '-', 'y', '/', 'x', '*', 'z', '-', 'x', '/', 'z', '+', 'y', '\0' };
        Postfix obj = new Postfix();
        System.out.println(obj.infixTopostfix(Arr));
    }
}

class Postfix {
    int top = -1;

    String infixTopostfix(char Arr[]) {
        String postfix = new String("");
        int i = 0;
        int j = 0;
        while (Arr[i] != '\0') {
            if (!isoperator(Arr[i])) {
                postfix += Arr[i];
                i++;
                j++;
            } else {
                if (precedence(Arr[i]) > precedence(stackTop(Arr))) {
                    push(Arr, Arr[i]);
                    i++;
                } else {
                    postfix += pop(Arr);
                    j++;
                }
            }
        }
        while (!isEmpty()) {
            postfix += pop(Arr);
            j++;
        }
        postfix += '\0';
        return postfix;
    }

    void push(char Arr[], char value) {
        if (!isFull(Arr)) {
            top++;
            Arr[top] = value;
        }
    }

    boolean isEmpty() {
        if (top < 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull(char Arr[]) {
        if (top >= Arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    char pop(char Arr[]) {
        if (!isEmpty()) {
            char temp = Arr[top];
            top--;
            return temp;
        } else {
            char n = 'N';
            return n;
        }
    }

    boolean isoperator(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            return true;
        } else {
            return false;
        }
    }

    char stackTop(char Arr[]) {
        if (!isEmpty()) {
            return Arr[top];
        } else {
            char n = 'N';
            return n;
        }
    }

    int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else {
            return 0;
        }
    }

}
