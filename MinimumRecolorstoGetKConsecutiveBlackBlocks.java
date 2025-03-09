import java.util.*;
public class MinimumRecolorstoGetKConsecutiveBlackBlocks {
    public static int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minRecolors = Integer.MAX_VALUE;
        int whiteCount = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
        }
        minRecolors = whiteCount;
   
        for (int i = k; i < n; i++) {
            if (blocks.charAt(i - k) == 'W') {
                whiteCount--; 
            }
            if (blocks.charAt(i) == 'W') {
                whiteCount++; 
            }
            minRecolors = Math.min(minRecolors, whiteCount);
        }

        return minRecolors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the blocks string: ");
        String blocks = scanner.next();
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();  
        int result = minimumRecolors(blocks, k);
        System.out.println("Minimum recolors needed: " + result);
        
        scanner.close();
    }
}
