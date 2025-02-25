public class CanPlaceFlower {
    public static boolean canPlaceFlowers(int[] bed, int n) {
        int planted = 0;
        
        for(int i = 0; i < bed.length; i++) {
            if(bed[i] == 0) {
                boolean leftEmpty = (i == 0) || (bed[i-1] == 0);
                boolean rightEmpty = (i == bed.length-1) || (bed[i+1] == 0);
                
                if(leftEmpty && rightEmpty) {
                    bed[i] = 1;
                    planted++;
                }
            }
        }
        return planted >= n;
    }

    public static void main(String[] args) {
       
        int[] flowerbed = {1, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(flowerbed, 1));
        System.out.println(canPlaceFlowers(flowerbed, 2));
    }
}