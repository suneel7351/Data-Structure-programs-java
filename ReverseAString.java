import java.util.Stack;

class ReverseAString {
    public static void main(String[] args) {
        String s = "Suneel Rajput";
        Reverse obj = new Reverse();
        String reverseorder = obj.ReverseString(s);
        System.out.println(reverseorder);
    }
}

class Reverse {
    String ReverseString(String str) {
        String reverseString = "";
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop();
        }
        return reverseString;
    }
}