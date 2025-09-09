import java.util.Arrays;

public class PlusOne66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > 0; i++) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        PlusOne66 digits = new PlusOne66();
        int[] result = digits.plusOne(array);
        System.out.println(Arrays.toString(result));
    }
}
