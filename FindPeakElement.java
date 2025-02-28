public class FindPeakElement {
    public  static int findPeakElement(int [] A){
        int n = A.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if((mid == 0 || A[mid - 1] <= A[mid]) && (mid == n - 1 || A[mid + 1] <= A[mid])){
                return mid;
            }
            else if(mid > 0 && A[mid - 1] > A[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1,2,1,3,5,6,4};
       // FindPeakElement fpe = new FindPeakElement();
        System.out.println(findPeakElement(A));
    }
    
}
