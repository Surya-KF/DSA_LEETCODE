public class MaximumValueofaStringinanArray {
    public static int maximumValue(String[] strs) {
        int max = 0;
        for (String str : strs) {
            int value = 0;
            for (char c : str.toCharArray()) {
                if (Character.isDigit(c)) {
                    value = value * 10 + (c - '0');
                } else {
                    value = str.length();
                    break;
                }
            }
            max = Math.max(max, value);
        }
        return max;
    }
    public static void main(String[] args) {
        String[] strs = {"alic3","bob","3  ","4","00000"};
        System.out.println(maximumValue(strs));
    }
}
