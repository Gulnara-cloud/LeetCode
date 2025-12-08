import java.util.Stack;

public class L_1047_RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        String result = "";
        while(!stack.isEmpty()) {
            result = stack.pop() + result;
        }
        return result;
    }

    public static void main(String[] args) {
        L_1047_RemoveAllAdjacentDuplicatesInString obj = new L_1047_RemoveAllAdjacentDuplicatesInString();
        String input = "abbaca";
        String output = obj.removeDuplicates(input);
        System.out.println(output);
    }
}

