/**Example 1:

Input: nums = [10,12,13,14]

Output: 1

Explanation:

nums becomes [1, 3, 4, 5] after all replacements, with minimum element 1.

*/

public class MinimumElementAfterReplacementwithSum {
    public static int minElement(int[] nums) {
        int minSum = Integer.MAX_VALUE;
        
        // Process each number in the array
        for (int num : nums) {
            int digitSum = getDigitSum(num);
            minSum = Math.min(minSum, digitSum);
        }
        
        return minSum;
    }
    
    // Helper method to calculate sum of digits
    private static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {10, 12, 13, 14};
        System.out.println(minElement(nums1));  // Output: 1
        
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(minElement(nums2));  // Output: 1
        
        int[] nums3 = {999, 19, 199};
        System.out.println(minElement(nums3));  // Output: 10
    }
}