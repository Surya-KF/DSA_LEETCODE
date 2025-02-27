public class MaximumAbsoluteSumofAnySubArray {
    public int maxAbsoluteSum(int[] nums) {
        int max = 0;
        int min = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            max = Math.max(max, sum);
            min = Math.min(min, sum);
        }
        return max - min;
    }
    public static void main(String[] args) {
        MaximumAbsoluteSumofAnySubArray m = new MaximumAbsoluteSumofAnySubArray();
        int[] nums = {1,-3,2,3,-4};
        System.out.println(m.maxAbsoluteSum(nums));
    }
}