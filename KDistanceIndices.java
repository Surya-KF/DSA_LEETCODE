import java.util.*;
public class KDistanceIndices {
    public static List<Integer> findKDistance(int[] nums, int key, int k) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] == key) {
                int left = Math.max(0, i - k);
                int right = Math.min(n - 1, i + k);
                for(int j = left; j <= right; j++) {
                    if(!result.contains(j)) {
                        result.add(j);
                    }
                }
            }
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 9, 1, 3, 9, 5};
        int key = 9;
        int k = 1;
        List<Integer> result = findKDistance(nums, key, k);
        System.out.println(result);
    }
}