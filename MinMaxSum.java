import java.util.List;
import java.util.Arrays;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        long minSum = 0;
        long maxSum = 0;
        long sum = 0;
        
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        
        long min = arr.get(0);
        long max = arr.get(0);
        
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) < min) {
                min = arr.get(i);
            }
            if(arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        
        minSum = sum - max;
        maxSum = sum - min;
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        miniMaxSum(numbers);
    }
}
