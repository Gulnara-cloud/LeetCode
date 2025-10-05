public class ReverseString344 {
    public static void reverseString(char[] s) {
        helper (s,0,s.length - 1);
    }
    private static void helper(char[] s, int left, int right) {
        if(left >= right) {
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        helper (s,left + 1,right - 1);
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }
}

