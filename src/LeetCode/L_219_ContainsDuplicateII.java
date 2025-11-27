import java.util.HashMap;

public class L_219_ContainsDuplicateII {
    public static boolean containsDuplicateII219(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hs.containsKey(nums[i])) {
                if (i - hs.get(nums[i]) <= k) {
                    return true;
                }
            }
            hs.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        System.out.println(containsDuplicateII219(nums, k));
    }
}

