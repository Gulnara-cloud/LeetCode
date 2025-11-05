import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString1047 {
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
        RemoveAllAdjacentDuplicatesInString1047 obj = new RemoveAllAdjacentDuplicatesInString1047();
        String input = "abbaca";
        String output = obj.removeDuplicates(input);
        System.out.println(output);
    }
}

