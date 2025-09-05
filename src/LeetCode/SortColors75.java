import java.util.Arrays;

import static java.util.Collections.swap;

public class SortColors75 {
    public void sortColors(int[] nums) {
        int zeroInsertPos = 0;
        int twoInsertPos = nums.length - 1;
        int i = 0;

        while(i < twoInsertPos) {
            if(nums[i] == 0) {
                swap(nums, zeroInsertPos, i);
                zeroInsertPos++;
                i++;
            } else if(nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, twoInsertPos);
                twoInsertPos--;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] array = {2, 0, 2, 1, 1, 0};
        SortColors75 answer = new SortColors75();
        answer.sortColors(array);
        System.out.println(Arrays.toString(array));
    }
}
