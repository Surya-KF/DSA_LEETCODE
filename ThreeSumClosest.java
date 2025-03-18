//Leetcode: 16. 3Sum Closest
//https://leetcode.com/problems/3sum-closest/

import java.util.Arrays;
public class ThreeSumClosest {
  public static int threeSumClosest(int[] nums, int target) {
    int n = nums.length;
    int closest = nums[0] + nums[1] + nums[2];
    Arrays.sort(nums);
    for (int i = 0; i < n - 2; i++) {
      int left = i + 1, right = n - 1;
      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];
        if (Math.abs(target - sum) < Math.abs(target - closest)) {
          closest = sum;
        }
        if (sum < target) {
          left++;
        } else if (sum > target) {
          right--;
        } else {
          return target;
        }
      }
    }
    return closest;
  }
  public static void main(String[] args) {
    int[] nums = {-1, 2, 1, -4};
    int target = 1;
    System.out.println(threeSumClosest(nums, target));
  }
  
}
