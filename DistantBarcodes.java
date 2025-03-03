//Leetcode 1054. Distant 
import java.util.*;
public class DistantBarcodes {
    public static int[] rearrangeBarcodes(int[] barcodes) {
        int n = barcodes.length;
        int[] ans = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : barcodes) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        int i = 0;
        while (!pq.isEmpty()) {
            int cur = pq.poll();
            int count = map.get(cur);
            while (count > 0) {
                ans[i] = cur;
                i += 2;
                if (i >= n) {
                    i = 1;
                }
                count--;
            }
            if (count > 0) {
                pq.offer(cur);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] barcodes = {1, 1, 1, 2, 2, 2};
        int[] ans = rearrangeBarcodes(barcodes);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

}
