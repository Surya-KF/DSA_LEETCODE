// Leetcode: 2579. Count Total Colored Cells in a Matrix
public class CountTotalColoredCells {
    public static long coloredCells(int n) {
        long ans = 1;
        for (int i = 2; i <= n; i++) {
            ans += 4 * (i - 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(coloredCells(n));
    }
    
}
