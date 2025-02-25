public class DistributeElementIntoTwoArraysI {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length/2 + nums.length%2];
        int[] arr2 = new int[nums.length/2];
        
        int n1 = 0, n2 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                arr1[n1++] = nums[i];
            } else {
                arr2[n2++] = nums[i];
            }
        }
        
        int[] result = new int[nums.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        
        return result;
    }

    public static void main(String[] args) {
        DistributeElementIntoTwoArraysI test = new DistributeElementIntoTwoArraysI();
        int[] nums = {2,1,3};
        int[] result = test.resultArray(nums);
        for(int num : result) {
            System.out.println(num);
        }
    }
}