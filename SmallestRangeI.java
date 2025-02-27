public class SmallestRangeI {
    public static int smallestrangeI(int []nums, int k ){
        int min = nums[0];
        int max = nums[0];
        for(int i = 0; i<nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return Math.max(0, max-min-2*k);
    }
    public static void main(String[] args) {
        int [] nums = {1, 3,6};
        int k = 3;
        System.out.println(smallestrangeI(nums, k));
    }
    
}
