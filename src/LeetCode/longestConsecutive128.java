import java.util.HashSet;

public class longestConsecutive128 {
    public static int longestConsecutive(int[] nums) {
        // create a HashSet from the array
        HashSet<Integer> set = new HashSet<>();
        int longestLength = 0;
        for (int n : nums) {
            set.add(n);
        }
        // Loop through each number x in the set
        for (int x : set) {
            // you will check if x is the start of sequence

            // Skip numbers that are not the start of a sequence
            if(set.contains(x - 1)) {
                continue;
            }
            // Start building a sequence from x:
            // (You keep adding +1 to currentNum as long as the next number exists in the set)
            // (You also count how long this sequence is with currentLength)
            int currentNum = x;
            int currentLength = 1;
            while(set.contains(currentNum + 1)) {
                currentNum++;
                currentLength++;
            }
            // If the current sequence is longer than the previous longest, update it
            longestLength = Math.max(longestLength, currentLength);
        }
        return longestLength;
    }
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
    // It skips 2, 3, 4 because they are not sequence starts.
    // It starts a sequence at 1: → 1, 2, 3, 4 → length = 4
    // Skips 100 and 200 because those don’t lead to longer sequences
    // So the final answer is 4
}

