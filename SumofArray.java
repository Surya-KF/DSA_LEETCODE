import java.util.List;
public class SumofArray {
    public static int simpleArraySum(List<Integer> arr){
        int n = arr.size();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 10, 11);
        int sum = simpleArraySum(arr);
        System.out.println(sum);
    }
    
}
