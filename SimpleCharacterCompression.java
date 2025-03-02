import java.util.Scanner;

public class SimpleCharacterCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(compressString(input));
        scanner.close();
    }

    private static String compressString(String str) {
        String result = "";
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result = result + str.charAt(i) + String.valueOf(count);
                count = 1;
            }
        }

        result = result+ str.charAt(str.length() - 1) + String.valueOf(count);
        return result;
    }
}

