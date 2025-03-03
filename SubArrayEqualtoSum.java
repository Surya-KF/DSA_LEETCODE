public class SubArrayEqualtoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int sum = 12;
        int[] result = findSubArrayWithSum(arr, sum);
        printResult(result);
    }

    public static int[] findSubArrayWithSum(int[] arr, int sum) {
        int n = arr.length;
        int start = 0;
        int end = 0;
        int currSum = 0;
        while (end < n) {
            currSum += arr[end];
            while (currSum > sum && start < end) {
                currSum -= arr[start];
                start++;
            }
            if (currSum == sum) {
                return new int[]{start, end};
            }
            end++;
        }
        return new int[]{-1, -1}; // No subarray found
    }

    public static void printResult(int[] result) {
        if (result[0] == -1) {
            System.out.println("No subarray found");
        } else {
            System.out.println("Sum found between indexes " + result[0] + " and " + result[1]);
        }
    }
}
