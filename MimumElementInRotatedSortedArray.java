
public class MimumElementInRotatedSortedArray {
    public static int findMin(int[] A){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < A.length; i++){
            if(A[i] < min){
                min = A[i];
            }
        }
        return min;
            
    }
    public static void main(String[] args) {
        int[] A = {3, 4, 5,-1, 0, 1, 2};
        System.out.println(findMin(A));
    }
    
}
