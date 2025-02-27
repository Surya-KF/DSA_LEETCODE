public class LengthofLongestFibonacciSequence {
    public static int lenLongestFibSubSeq(int[]A){
        int n = A.length;
        int ans = 0;
        int [][] dp = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                dp[i][j]=2;
                int a = A[i];
                int b = A[j];
                int k = j+1;
                while(k<n){
                    if(A[k]==a+b){
                        dp[i][j]++;
                        a = b;
                        b = A[k];
                    }
                    k++;
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        return ans>2?ans:0;          
                        
    }

    public static void main(String[] args) {
        int [] A = {1,3,7,11,12,14,18};
        System.out.println(lenLongestFibSubSeq(A));
    }
}
