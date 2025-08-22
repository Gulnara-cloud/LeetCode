import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];

        for (int num : nums) {
            seen[num] = true;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                result.add(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }
}