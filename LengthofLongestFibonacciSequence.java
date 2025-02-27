import java.util.Hashtable;

public class LengthofLongestFibonacciSequence {
    public static int lenLongestFibSubSeq(int[] A) {
        int n = A.length;
        Hashtable<Integer, Integer> index = new Hashtable<>();
        int[][] dp = new int[n][n];
        
        // Store value-to-index mapping
        for(int i = 0; i < n; i++) {
            index.put(A[i], i);
        }
        
        int maxLen = 0;
        for(int j = 0; j < n; j++) {
            for(int k = j + 1; k < n; k++) {
                int ai = A[k] - A[j];
                if(ai < A[j] && index.containsKey(ai)) {
                    int i = index.get(ai);
                    dp[j][k] = dp[i][j] + 1;
                    maxLen = Math.max(maxLen, dp[j][k] + 2);
                }
            }
        }
        
        return maxLen >= 3 ? maxLen : 0;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 7, 11, 12, 14, 18};
        System.out.println(lenLongestFibSubSeq(A));
    }
}