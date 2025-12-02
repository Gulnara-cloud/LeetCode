public class L_643_FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int SumMax = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            SumMax = Math.max(SumMax, sum);
        }
        return (double) SumMax / k;
    }
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        L_643_FindMaxAverage obj = new L_643_FindMaxAverage();
        double result = obj.findMaxAverage(nums, 4);
        System.out.println(result);
    }
}
