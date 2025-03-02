import java.util.Scanner;

public class ValidatePhone {
    public static boolean isValidPhoneNumber(String phone) {
        return phone.matches("^(\\+91|91)?[-]?[6-9][0-9]{9}$");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        System.out.println(isValidPhoneNumber(phone) ? "Valid" : "Invalid");

        scanner.close();
    }
}

