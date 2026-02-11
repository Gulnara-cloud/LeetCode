import java.util.ArrayList;
import java.util.List;

public class L_784_LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), 0, result);
        return result;
    }
    private void backtrack(char[] chars, int index, List<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }
        if (Character.isLetter(chars[index])) {
            chars[index] = Character.toLowerCase(chars[index]);
            backtrack(chars , index + 1, result);

            chars[index] = Character.toUpperCase(chars[index]);
            backtrack(chars , index + 1, result);
        } else {
            backtrack(chars, index + 1, result);
        }
    }
    public static void main(String[] args) {

        L_784_LetterCasePermutation solver = new L_784_LetterCasePermutation();

        String input1 = "a1b2";
        String input2 = "3z4";

        System.out.println(solver.letterCasePermutation(input1));
        System.out.println(solver.letterCasePermutation(input2));
    }
}

