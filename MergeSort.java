public class MergeSort {
    void mergeSort(int arr[], int l, int r){
        if(l < r){
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    void merge(int[] arr, int l, int mid, int r){
        int temp[] = new int[r - l + 1];
        int left = l;
        int right = mid + 1;
        int k = 0;

        while(left <= mid && right <= r){
            if(arr[left] <= arr[right]){
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }
            k++;
        }

        // Copy remaining elements of left subarray, if any
        while(left <= mid){
            temp[k] = arr[left];
            left++;
            k++;
        }

        // Copy remaining elements of right subarray, if any
        while(right <= r){
            temp[k] = arr[right];
            right++;
            k++;
        }

        // Copy the merged subarray back to the original array
        for(int i = 0; i < temp.length; i++){
            arr[l + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int a[] = {5, 4, 10, 1, 6, 2};
        ms.mergeSort(a, 0, a.length - 1);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}