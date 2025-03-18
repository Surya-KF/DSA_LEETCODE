// leetcode 796. Rotate String
// https://leetcode.com/problems/rotate-string/
// Input: s = "abcde", goal = "cdeab"
public class RotateString {
  public static boolean rotateString(String s, String goal) {
      if (s.length() != goal.length()) {
            return false;
        }

    String doubleS = s + s;
    return doubleS.contains(goal);
  }
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
  }
}
