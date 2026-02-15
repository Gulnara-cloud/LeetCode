import java.util.ArrayList;
import java.util.List;

public class L_46_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> result) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));

            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) {
                continue;
            }
            temp.add(nums[i]);
            backtrack(nums, temp, result);
            temp.remove(temp.size() - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(new L_46_Permutations().permute(new int[]{1,2,3}));
    }
}
