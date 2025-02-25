public class LargestOddNumber {
    public static String largestOddNumber(String num) {
        int n = num.length();
        for (int i = n - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return ""; 
    }

    public static void main(String[] args) {
        String num = "52";
        String result = largestOddNumber(num);
        System.out.println(result);
    }
}