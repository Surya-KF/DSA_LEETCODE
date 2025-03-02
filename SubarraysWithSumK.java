import java.util.Arrays;

public class SubarraysWithSumK {
    
    public static void subarraysWithSumK(int[] arr, int k) {
        for (int start = 0; start < arr.length; start++) {
            int currentSum = 0;
            for (int end = start; end < arr.length; end++) {
                currentSum += arr[end];
                
                if (currentSum == k) {
                    System.out.print("Subarray: ");
                    for (int i = start; i <= end; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 3, 4};
        int k = 6;
        System.out.println("The original: " + Arrays.toString(arr));
        subarraysWithSumK(arr, k);
    }
}

