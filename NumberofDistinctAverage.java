import java.util.Arrays;

public class NumberofDistinctAverage {
    public static int distinctAverage(int[] nums) {
        Arrays.sort(nums);
        
        double[] averages = new double[nums.length/2];  
        int avgIndex = 0;
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            averages[avgIndex++] = (nums[left] + nums[right]) / 2.0;
            left++;
            right--;
        }
        
        Arrays.sort(averages);
        
        int distinctCount = 1;
        for (int i = 1; i < averages.length; i++) {
            if (averages[i] != averages[i-1]) {
                distinctCount++;
            }
        }
        
        return distinctCount;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,4,0,3,5};
        int[] nums2 = {1,100};
        
        System.out.println(distinctAverage(nums1)); 
        System.out.println(distinctAverage(nums2));
    }
}
