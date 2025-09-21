import java.util.Arrays;

public class MoveZeroes283 {
    public static void main(String[] args) {
            int[] nums = {0, 1, 0, 3, 13};
            moveZeroes(nums);
            System.out.println(Arrays.toString(nums));
        }

        public static void moveZeroes(int[] nums) {
            int left = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[left];
                    nums[left] = temp;
                    left++;
                }
            }
        }
    }
