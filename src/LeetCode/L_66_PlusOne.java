import java.util.Arrays;

public class L_66_PlusOne {
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
        L_66_PlusOne digits = new L_66_PlusOne();
        int[] result = digits.plusOne(array);
        System.out.println(Arrays.toString(result));
    }
}
