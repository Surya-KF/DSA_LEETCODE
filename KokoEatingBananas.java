public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int H) {
        int left = 1;
        int right = 1000000000;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, H, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean canEatAll(int[] piles, int H, int K) {
        int time = 0;
        for (int pile : piles) {
            time += (pile + K - 1) / K;
        }
        return time <= H;
    }

    public static void main(String[] args) {
        //KokoEatingBananas k = new KokoEatingBananas();
        int[] piles = {3, 6, 7, 11};
        int H = 8;
        System.out.println(minEatingSpeed(piles, H));
    }
    
}
