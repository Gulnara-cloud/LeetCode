public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        RemoveElement27 obj = new RemoveElement27();
        int[] nums = {3, 2, 2, 4};
        int result = obj.removeElement(nums, 3);
        System.out.println(result);
    }
}


