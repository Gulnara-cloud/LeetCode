public class L_69_Sqrt {
    public static void main(String[] args) {
        int x = 4;
        int left = 0;
        int right = x;
        while (left + 1 < right) {
            long mid = (left + right) / 2;
            if (mid * mid <= x) {
                left = (int) mid;
            } else {
                right = (int) mid;
            }
        }
        long mid = right;
        if (mid * mid <= x) {
            left = (int) mid;
        }
        System.out.println(left);
    }
}


