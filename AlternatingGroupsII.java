public class AlternatingGroupsII {
  public static int numberOfAlternatingGroups(int[] colors, int k) {
    int n = colors.length;
    int result = 0;
    int consecutive = 1;
    
    for (int i = 1; i < n + k - 1; i++) {
        if (colors[i % n] != colors[(i - 1) % n]) {
            consecutive++;
            if (consecutive >= k) {
                result++;
            }
        } else {
            consecutive = 1;
        }
    }
    
    return result;
  }

  public static void main(String[] args) {
      int[] colors1 = {0, 1, 0, 1, 0};
      int k1 = 3;
      System.out.println(numberOfAlternatingGroups(colors1, k1));
      
      int[] colors2 = {0, 1, 0, 0, 1, 0, 1};
      int k2 = 6;
      System.out.println(numberOfAlternatingGroups(colors2, k2));
      
      int[] colors3 = {1, 1, 0, 1};
      int k3 = 4;
      System.out.println(numberOfAlternatingGroups(colors3, k3));
  }
}