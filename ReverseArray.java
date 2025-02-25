import java.util.*;
public class ReverseArray {
    public static List<Integer> reverseArray(List<Integer> a){
        int start =0;
        int end = a.size() - 1;;
        int temp;
        while(start < end){
            temp = a.get(start);
            a.set(start, a.get(end));
            a.set(end, temp);
            start++;
            end--;
        }
        return a;
    }
    public static void main(String[] args) {
        List<Integer> a =   Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> reversedArray = reverseArray(a);
        System.out.println(reversedArray);                  

    }
    
}
