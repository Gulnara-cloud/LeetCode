import java.util.Arrays;

public class L_905_SortArrayByParityOpt {
    public static int[] sortArrayByParity(int[] nums) {
        int index = 0;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[index++] = nums[i];
            }
        }
        for (int j = 0; j < nums.length; j++){
            if (nums[j] % 2 != 0) {
                result[index++] = nums[j];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] result = sortArrayByParity(nums);
        System.out.print(Arrays.toString(result));
    }
}

