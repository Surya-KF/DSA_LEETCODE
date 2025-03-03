public class PartitionArrayAccordingToGivenPivot {
    public static int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                ans[index++] = nums[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == pivot) {
                ans[index++] = nums[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > pivot) {
                ans[index++] = nums[i];
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        int[] ans = pivotArray(nums, pivot);
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}