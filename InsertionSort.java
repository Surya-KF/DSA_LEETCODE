public class InsertionSort {
    public static void insertionSort(int a[]){
        int n = a.length;
        for(int i=0; i<=n-1; i++){
            int j = i;
            while(j>0 && a[j-1]>a[j]){
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,10,1,6,2};
        insertionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
