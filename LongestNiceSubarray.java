//LeetCoede:2401. Longest Nice Subarray
//URL: https://leetcode.com/problems/longest-nice-subarray/
public class LongestNiceSubarray {
  public static int longestNiceSubarray(int[] nums) {
    int ans = 0;
    int mask = 0;
    for (int l = 0, r = 0; r < nums.length; ++r) {
      while ((mask & nums[r]) > 0)
        mask ^= nums[l++];
      mask ^= nums[r];
      ans = Math.max(ans, r - l + 1);
    }
    return ans;
  }
  public static void main(String[] args) {
    int[] nums = {1,3,8,48,10};
    System.out.println(longestNiceSubarray(nums));
  }
}