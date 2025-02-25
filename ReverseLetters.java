import java.util.Scanner;

public class ReverseLetters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        System.out.println("Reversed String: " + reversed.toString().trim());
        sc.close();
    }
}

