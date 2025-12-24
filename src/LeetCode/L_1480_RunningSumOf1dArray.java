import java.util.Arrays;

public class L_1480_RunningSumOf1dArray {
    public static int[] runningSum(int[] nums) {
        int prefSum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefSum += nums[i];
            nums[i] = prefSum;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int[] runningSum = runningSum(nums);
        System.out.println(Arrays.toString(runningSum));
    }
}
