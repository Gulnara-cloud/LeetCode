public class L_171_ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }

    public static void main(String[] args) {
        String columnTitle = "AB";
        int result = titleToNumber(columnTitle);
        System.out.println(result);
    }
}

