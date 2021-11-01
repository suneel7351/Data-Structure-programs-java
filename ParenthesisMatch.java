class ParenthesisMatch {
    int top = -1;

    boolean isEmpty() {
        if (top < 0) {
            return true;
        } else {
            return false;
        }
    }

    void push(char ch, char array[]) {
        top++;
        array[top] = ch;
    }

    char pop(char array[]) {
        if (!isEmpty()) {
            char ch = array[top];
            top--;
            return ch;
        } else {
            char n;
            return 'n';
        }
    }

    boolean isMatched(char a, char b) {
        if (a == '(' && b == ')') {
            return true;
        } else if (a == '{' && b == '}') {
            return true;
        } else if (a == '[' && b == ']') {
            return true;
        } else {
            return false;
        }
    }

    boolean isBalance(String exp) {
        char array[] = new char[exp.length()];
        char poped_ch;
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(' || exp.charAt(i) == '[' || exp.charAt(i) == '{') {
                push(exp.charAt(i), array);
            } else if (exp.charAt(i) == ')' || exp.charAt(i) == ']' || exp.charAt(i) == '}') {
                if (isEmpty()) {
                    return false;
                }
                poped_ch = pop(array);

                if (!isMatched(poped_ch, exp.charAt(i))) {
                    return false;
                }
            }
        }
        if (isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String exp = "[(x-y)-6+8*6-(9-6)*y-8-(6/5)])}";
        ParenthesisMatch obj = new ParenthesisMatch();
        if (obj.isBalance(exp)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
