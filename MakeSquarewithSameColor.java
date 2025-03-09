// LeetCode: 3127
public class MakeSquarewithSameColor{
    public static boolean canMakeSquare(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'B') {
                    dp[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'W') {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'B') {
                    dp[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] += dp[i][j - 1];
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] += dp[i - 1][j];
            }
        }
        int total = dp[n - 1][m - 1];
        if (total % 4 != 0) {
            return false;
        }
        int side = total / 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dp[i][j] == side) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] grid = {{'W', 'B', 'W', 'B', 'B', 'W'}, {'W', 'B', 'W', 'B', 'B', 'W'}, {'W', 'B', 'W', 'B', 'B', 'W'}, {'W', 'B', 'W', 'B', 'B', 'W'}};
        System.out.println(canMakeSquare(grid));
    }
        
}