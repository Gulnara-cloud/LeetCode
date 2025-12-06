import java.util.Arrays;

public class L_905_SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int[] sorted = new int[nums.length];
        int even = 0;
        int odd = nums.length - 1;
        for (int i : nums) {
            if (i % 2 == 0) {
                sorted[even++] = i;
            } else {
                sorted[odd--] = i;
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] result = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(result)));
    }
}
