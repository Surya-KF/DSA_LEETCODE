// leetcode: 2965. Find Missing and Repeated Values in 2D Array
public class FindMissingandREapeatedValuesin2DArray {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] count = new int[n * n + 1];
        int[] result = new int[2];

        for (int[] row : grid) {
            for (int num : row) {
                count [num]++;
                if (count[num] == 2) {
                    result[0] = num;
                }
            }
        }

        for (int num = 1; num <= n * n; num++) {
            if (count[num] == 0) {
                result[1] = num;
                break;
            }
        }

        return result;
    }

    // Test the solution
    public static void main(String[] args) {
        //Solution solution = new Solution();

        // Test case 1: [[1,3],[2,2]]
        int[][] grid1 = {{1, 3}, {2, 2}};
        int[] result1 = findMissingAndRepeatedValues(grid1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
    }
}