// Leetcode: 2570. Merge Two 2D Arrays by Summing Values
import java.util.Map;
import java.util.TreeMap;
public class Merging2DArraysBYSummingValues {
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] num : nums1) {
            map.put(num[0], map.getOrDefault(num[0], 0) + num[1]);
        }
        for (int[] num : nums2) {
            map.put(num[0], map.getOrDefault(num[0], 0) + num[1]);
        }
        int[][] result = new int[map.size()][2];
        int i = 0;
        for (int key : map.keySet()) {
            result[i][0] = key;
            result[i][1] = map.get(key);
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] nums1 = {{1, 2}, {2, 3}, {4, 5}};
        int[][] nums2 = {{1, 4}, {3, 2}, {5, 1}};
        int[][] result = mergeArrays(nums1, nums2);
        for (int[] num : result) {
            System.out.println(num[0] + " " + num[1]);
        }   
    }
}
