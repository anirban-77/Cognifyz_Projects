import java.util.Scanner;

public class palindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or number: ");
        String input = scanner.nextLine();

        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();

        if (cleanedInput.equals(reversedInput)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }
}
