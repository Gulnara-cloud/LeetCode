import java.util.Arrays;

public class RotateArray189 {
    // Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public static void reverse (int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        RotateArray189 solution = new RotateArray189();
        solution.rotate(array, k);
        System.out.println(Arrays.toString(array));
    }
}
