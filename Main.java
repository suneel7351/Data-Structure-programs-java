
class Main {
    public static void main(String[] args) {
        sReverse obj = new sReverse();
        obj.ReverseString("SuneelRajput");
        obj.display();
        obj.poping();
        obj.display();
    }
}

class sReverse {
    int top = -1;
    char ch[] = new char[12];

    void push(char c) {
        top++;
        ch[top] = c;
    }

    boolean isEmpty() {
        if (top < 0) {
            return false;
        } else {
            return true;
        }
    }

    char pop() {
        if (!isEmpty()) {
            char temp = ch[top];
            top--;
            return temp;
        } else {
            return '0';
        }
    }

    void ReverseString(String str) {
        for (int i = 0; i < str.length(); i++) {
            push(str.charAt(i));
        }
    }

    void poping() {
        while (!isEmpty()) {
            pop();
        }
    }

    void display() {
        for (int j = 0; j < ch.length; j++) {
            System.out.print(ch[j] + " ");
        }
        System.out.print("\n");
    }
}