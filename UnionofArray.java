public class UnionofArray {

    public static void findUnion(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int prev = Integer.MIN_VALUE;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (arr1[i] != prev) {
                    System.out.print(arr1[i] + " ");
                    prev = arr1[i];
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (arr2[j] != prev) {
                    System.out.print(arr2[j] + " ");
                    prev = arr2[j];
                }
                j++;
            } else {
                if (arr1[i] != prev) {
                    System.out.print(arr1[i] + " ");
                    prev = arr1[i];
                }
                i++;
                j++;
            }
        }


        while (i < arr1.length) {
            if (arr1[i] != prev) {
                System.out.print(arr1[i] + " ");
                prev = arr1[i];
            }
            i++;
        }


        while (j < arr2.length) {
            if (arr2[j] != prev) {
                System.out.print(arr2[j] + " ");
                prev = arr2[j];
            }
            j++;
        }


        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};
        System.out.print("Union of arrays: ");
        findUnion(arr1, arr2);
    }
}

