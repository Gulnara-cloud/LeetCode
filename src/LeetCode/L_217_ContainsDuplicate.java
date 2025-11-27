import java.util.HashSet;

public class L_217_ContainsDuplicate {
    public static void main(String[] args) {
        L_217_ContainsDuplicate obj = new L_217_ContainsDuplicate();
        int[] nums = {1, 2, 3, 4};
        System.out.println(obj.containsDuplicate(nums));
    }
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!seen.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}

