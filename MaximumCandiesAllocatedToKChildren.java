//Leetcode: 2226. Maximum Candies Allocated to K Children 
//https://leetcode.com/problems/maximum-candies-allocated-to-k-children/
public class MaximumCandiesAllocatedToKChildren {
  public static int maximumCandies(int[] candies, long k) {
    long sum = 0;
    for (int candy : candies) {
      sum += candy;
    }
    if (sum < k) {
      return 0;
    }
    long l = 1, r = sum / k;
    while (l < r) {
      long mid = (l + r + 1) / 2;
      if (check(candies, k, mid)) {
        l = mid;
      } else {
        r = mid - 1;
      }
    }
    return (int) l;
  }  
  private static boolean check(int[] candies, long k, long mid) {
    long count = 0;
    for (int candy : candies) {
      count += candy / mid;
    }
    return count >= k;

  }
  public static void main(String[] args) {
    int[] candies = {5,8,6};
    long k = 3;
    System.out.println(maximumCandies(candies, k));
  }
}