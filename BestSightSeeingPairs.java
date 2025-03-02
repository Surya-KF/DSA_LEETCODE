public class BestSightSeeingPairs {
    public static int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        int max = 0;
        int maxLeft = values[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, maxLeft + values[i] - i);
            maxLeft = Math.max(maxLeft, values[i] + i);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] values = {8, 1, 5, 2, 6};
        System.out.println(maxScoreSightseeingPair(values));
    }
    
}
