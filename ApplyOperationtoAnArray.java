
// Leetcode 2460. Apply Operation to an Array
public class ApplyOperationtoAnArray {
    public static int[] applyOperations(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 1, 0};
        int[] result = applyOperations(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
