public class ShortestSubArraywithSumatLeastK {
    public static int shortestSubarray(int[] nums, int target) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += nums[end];
                if (sum == target) {
                    minLength = Math.min(minLength, end - start + 1);
                    break;
                }
            }
        }
        
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, -1, 2};
        int target = 3;
        System.out.println("Shortest subarray length: " + shortestSubarray(arr, target));
    }
}