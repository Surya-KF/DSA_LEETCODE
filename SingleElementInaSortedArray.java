public class SingleElementInaSortedArray {
    public static int singleElementInaSortedArray(int[] nums){
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if((mid == 0 || nums[mid - 1] != nums[mid]) && (mid == n - 1 || nums[mid + 1] != nums[mid])){
                return nums[mid];
            }
            else if(mid % 2 == 0){
                if(nums[mid] == nums[mid + 1]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            else{
                if(nums[mid] == nums[mid - 1]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,4,8,8};
        System.out.println(singleElementInaSortedArray(nums));
    }
}
