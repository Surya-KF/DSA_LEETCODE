import java.util.*;
class GreatestCommonDivisorOfStrings {
    public String gcdofStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String:");
        String s1 =  sc.nextLine();
        System.out.println("Enter the Second String:");
        String s2 =  sc.nextLine();

        GreatestCommonDivisorOfStrings sol =  new GreatestCommonDivisorOfStrings();
        String result =  sol.gcdofStrings(s1, s2);
        System.out.println("Output:"+result);
        sc.close();
    }
}
