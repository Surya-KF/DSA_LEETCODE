public class MaximumDifferenceBetweenIncreasingElements{
    public static int maxDifference(int[] nums){
        int maxDiff = -1;
        int min = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > min){
                maxDiff = Math.max(maxDiff, nums[i] - min);
            }else{
                min = nums[i];
            }
        }
        return maxDiff;
    }
    public static void main(String[] args){
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxDifference(nums));
    }
}