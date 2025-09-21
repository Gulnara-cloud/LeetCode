import java.util.Arrays;

public class SortAnArray912 {
    public static int[] sortArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) break;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 1};
        array = sortArray(array);
        System.out.println(Arrays.toString(array));
    }
}



