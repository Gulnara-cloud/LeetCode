public class SingleNumber136 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        int unique = 0;
        for (int num : nums) {
            unique ^= num;
        }
        System.out.println(unique);
    }
}

