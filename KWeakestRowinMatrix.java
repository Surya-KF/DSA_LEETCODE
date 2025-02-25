import java.util.Arrays;

public class KWeakestRowinMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        int[] strength = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            strength[i] = count * 1000 + i;
        }
        Arrays.sort(strength);
        for (int i = 0; i < k; i++) {
            result[i] = strength[i] % 1000;
        }
        return result;

    }
    public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1}
        };
        int k = 4;
        KWeakestRowinMatrix solution = new KWeakestRowinMatrix();
        int[] result = solution.kWeakestRows(mat, k);
        System.out.println(Arrays.toString(result));

    }
}
