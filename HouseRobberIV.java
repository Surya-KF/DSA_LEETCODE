public class HouseRobberIV {
  public int minCapability(int[] nums, int k) {
      int left = 1;
      int right = 0;
      
      for (int num : nums) {
          right = Math.max(right, num);
      }
      
      while (left < right) {
          int mid = left + (right - left) / 2;
          
          if (canRobKHouses(nums, k, mid)) {
              right = mid;
          } else {
              left = mid + 1;
          }
      }
      
      return left;
  }
  
  private boolean canRobKHouses(int[] nums, int k, int capability) {
      int count = 0;
      int i = 0;
      
      while (i < nums.length) {
          if (nums[i] <= capability) {
              count++;
              i += 2;
          } else {
              i++;
          }
          if (count >= k) return true;
      }
      
      return count >= k;
  }

  public static void main(String[] args) {
      HouseRobberIV solution = new HouseRobberIV();
      
      int[] nums1 = {2, 3, 5, 9};
      int k1 = 2;
      System.out.println(solution.minCapability(nums1, k1));
      
      int[] nums2 = {2, 7, 9, 3, 1};
      int k2 = 2;
      System.out.println(solution.minCapability(nums2, k2));
  }
}