public class SemiOrderedPermutation {
    public static int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        int onePos = 0;
        int nPos = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) onePos = i;
            if (nums[i] == n) nPos = i;
        }
        
        int moves = onePos + (n - 1 - nPos);
        
        if (onePos > nPos) {
            moves--;
        }
        
        return moves;
    }
    public static void main(String[] args) {
        // Example test case
        int[] nums = {2, 4, 1, 3};
        System.out.println("Input array: " + java.util.Arrays.toString(nums));
        System.out.println("Minimum swaps needed: " + semiOrderedPermutation(nums));
    }
}
