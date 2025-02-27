import java.util.*;

public class MinimumRightShift {
    public static int minRightShift(List<Integer> nums) {
        int n = nums.size();
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (nums.get(i) < nums.get(minIndex)) {
                minIndex = i;
            }
        }
        for (int i = 1; i < n; i++) {
            int currIndex = (minIndex + i) % n;
            int prevIndex = (minIndex + i - 1) % n;
            if (nums.get(currIndex) < nums.get(prevIndex)) {
                return -1; // Not a valid rotation
            }
        }
        if (minIndex == 0) return 0;

        return n - minIndex;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 3, 5);
        System.out.println(minRightShift(nums)); // Output: 0

        List<Integer> nums2 = Arrays.asList(5, 1, 3);
        System.out.println(minRightShift(nums2)); // Output: 2

        List<Integer> nums3 = Arrays.asList(3, 4, 5, 1, 2);
        System.out.println(minRightShift(nums3)); // Output: 3

        List<Integer> nums4 = Arrays.asList(2, 1, 5, 3);
        System.out.println(minRightShift(nums4)); // Output: -1 (Invalid rotation)
    }
}
