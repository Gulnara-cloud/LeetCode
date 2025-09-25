import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int n = nums.length;
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (count.get(num) > n / 2) {
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        MajorityElement169 solution = new MajorityElement169();
        int result = solution.majorityElement(nums);
        System.out.println(result);
    }
}
