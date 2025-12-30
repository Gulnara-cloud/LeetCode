import java.util.HashSet;
import java.util.Set;

public class L_26_RemoveDuplFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int index = 0;
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(!seen.contains(nums[i])) {
                seen.add(nums[i]);
                nums[index++] = nums[i];
            }
        }
        return seen.size();
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }
}


