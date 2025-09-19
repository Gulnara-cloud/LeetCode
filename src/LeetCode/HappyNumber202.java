import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);
            n = sumOfSquares(n);
        }
        return true;
    }
    private int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
           sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        HappyNumber202 obj = new HappyNumber202();
        System.out.println(obj.isHappy(19));
        System.out.println(obj.isHappy(2));
    }
}

