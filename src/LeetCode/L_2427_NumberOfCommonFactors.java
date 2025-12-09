public class L_2427_NumberOfCommonFactors {
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
        L_2427_NumberOfCommonFactors obj = new L_2427_NumberOfCommonFactors();
        int result = obj.commonFactors(12, 6);
        System.out.println(result );
    }
}

