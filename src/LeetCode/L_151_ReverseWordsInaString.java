public class L_151_ReverseWordsInaString {
    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].isEmpty()) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(arr[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String result = "the sky is blue";
        System.out.println(reverseWords(result));
    }
}
