public class L_303_RangeSumQuery {
    int[] prefix;

    public L_303_RangeSumQuery(int[] nums) {
        int n = nums.length;

        prefix = new int[n + 1];
        prefix[0] = 0;
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }
    }
    public int sumRange(int left, int right) {
        left++; right++;
        return prefix[right] - prefix[left - 1];
    }
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        L_303_RangeSumQuery obj = new L_303_RangeSumQuery(nums);

        System.out.print(obj.sumRange(0, 2)+ ",");
        System.out.print(obj.sumRange(2, 5)+ ",");
        System.out.print(obj.sumRange(0, 5));
    }
}

