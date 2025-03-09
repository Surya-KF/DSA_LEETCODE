//Leetcode: 2951. Find the Peaks 
import java.util.*;
public class FindthePeaksinRange {
   public static List<Integer> findPeaks(int[] A) {
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i-1] && A[i] > A[i+1]) {
                    peaks.add(i);
            }
        }
        return peaks;
         
     }
   public static void main(String[] args) {
        int[] A = {2,4,4};
        List<Integer> peaks = findPeaks(A);
        System.out.println(peaks);
    }
}
