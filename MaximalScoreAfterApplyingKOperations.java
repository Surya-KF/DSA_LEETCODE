import java.util.PriorityQueue;

public class MaximalScoreAfterApplyingKOperations {
    public static long maxKElements(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>((a, b) -> Long.compare(b, a));
        for (int num : nums) {
            pq.add((long) num);
        }

        long score = 0;
        while (k-- > 0) {
            long max = pq.poll();
            score += max;
            pq.add((max + 2) / 3);
        }

        return score;
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 10, 10, 10, 10};
        int k1 = 5;
        System.out.println(maxKElements(nums1, k1)); // Output: 50

        int[] nums2 = {1, 10, 3, 3, 3};
        int k2 = 3;
        System.out.println(maxKElements(nums2, k2)); // Output: 17
    }
}
