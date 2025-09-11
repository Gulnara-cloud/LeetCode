public class NumberOfCommonFactors2427 {
    public int commonFactors(int a, int b) {
        int x = Math.min(a, b);
        int count = 0;
        for(int i = 1; i <= x; i++) {
            if(a % i == 0 && b % i ==0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        NumberOfCommonFactors2427 obj = new NumberOfCommonFactors2427();
        int result = obj.commonFactors(12, 6);
        System.out.println(result );
    }
}

