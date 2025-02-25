import  java.util.Arrays;
public class SortedArrayswithSquare {
    public static void main(String[] args) {
        int[] arr = {-6, -3, -1, 2, 4, 5};
        int n = arr.length;
        int result[] = new int [n];
        for(int i =0; i<n; i++){ 
            result[i] = arr[i]*arr[i];
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}
