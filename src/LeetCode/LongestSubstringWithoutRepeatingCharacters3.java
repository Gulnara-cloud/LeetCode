import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static int lengthOfLongestSubstring(String s) {
        int maxValue = 0;
        for(int start = 0; start < s.length(); start++) {
            Set<Character> seen = new HashSet<>();
            for(int end = start; end < s.length(); end++) {
                char letter = s.charAt(end);
                if(seen.contains(letter)) {
                    break;
                }
                seen.add(letter);
                int currentLength = end - start + 1;
                maxValue = Math.max(maxValue, currentLength);
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("abcabcbb");
        System.out.println(result);
    }
}
