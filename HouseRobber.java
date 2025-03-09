public class HouseRobber {
    public static int rob(int[] nums) {
        int prev = 0, curr = 0;
        for (int num : nums) {
            int temp = curr;
            curr = Math.max(prev + num, curr);
            prev = temp;
        }
        return curr;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(rob(nums));
    }
}
