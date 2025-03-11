import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String processedStr = str.replaceAll("\\s+", "").toLowerCase();
        String reversedStr = new StringBuilder(processedStr).reverse().toString();

        if (processedStr.equals(reversedStr)) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}
