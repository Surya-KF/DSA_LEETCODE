// Input: nums = [1,2,0,0], k = 34
// Output: [1,2,3,4]
// Explanation: 1200 + 34 = 1234
import java.util.*;
public class AddtoArrayForm {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int n = num.length;
        int i = n - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
            }
            result.add(k % 10);
            k /= 10;
            i--;
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int k = 34;
        List<Integer> result = addToArrayForm(num, k);
        System.out.println(result);
    }
    
}
