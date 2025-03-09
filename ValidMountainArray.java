public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }
        if (i == 0 || i == n - 1) {
            return false;
        }
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }
        return i == n - 1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 3, 5,2, 1, 0};
        System.out.println(validMountainArray(arr));
    }
    
}
