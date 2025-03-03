//Leetcode: 3033. Modify the Matrix
public class ModifyTheMatrix {
    public static int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for (int j = 0; j < n; ++j) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < m; ++i) {
                max = Math.max(max, matrix[i][j]);
            }
            for (int i = 0; i < m; ++i) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = max;
                }
            }
        }
        return matrix;
    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, -1}, {4, -1, 6}, {7, 8, 9}};
        int[][] ans = modifiedMatrix(matrix);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}