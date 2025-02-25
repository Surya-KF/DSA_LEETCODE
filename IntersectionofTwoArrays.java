import java.util.Arrays;
public class IntersectionofTwoArrays {
    public static int[] intersect(int[] nums1, int[] nums2){
        // Sort both arrays first
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int n = nums1.length;
        int m = nums2.length;
        int[] result = new int[Math.min(n, m)];
        int i = 0, j = 0, k = 0;
        
        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                result[k] = nums1[i];
                i++;
                j++;
                k++;
            }
        }
        return Arrays.copyOfRange(result, 0, k);
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}