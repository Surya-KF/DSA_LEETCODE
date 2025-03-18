public class NumberofSubstringsContainingAllThreeCharacters {
  public static int numberOfSubstrings(String s) {
    int[] count = new int[3];
    int left = 0;
    int right = 0;
    int result = 0;
    while (right < s.length()) {
      count[s.charAt(right) - 'a']++;
      while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
        result += s.length() - right;
        count[s.charAt(left) - 'a']--;
        left++;
      }
      right++;
    }
    return result;
  }
  public static void main(String[] args) {
    String s = "abcabc";
    System.out.println(numberOfSubstrings(s));
  }
}
