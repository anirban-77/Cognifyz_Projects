import java.security.SecureRandom;
import java.util.Scanner;

public class randompwdg {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter desired password length: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Include numbers? (y/n): ");
        boolean includeNumbers = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include lowercase letters? (y/n): ");
        boolean includeLowercase = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include uppercase letters? (y/n): ");
        boolean includeUppercase = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include special characters? (y/n): ");
        boolean includeSpecial = scanner.nextLine().equalsIgnoreCase("y");

        String password = generatePassword(length, includeNumbers, includeLowercase, includeUppercase, includeSpecial);

        System.out.println("Generated Password: " + password);

        scanner.close();
    }

    private static String generatePassword(int length, boolean includeNumbers, boolean includeLowercase, boolean includeUppercase, boolean includeSpecial) {
        StringBuilder characterSet = new StringBuilder();
        if (includeLowercase) {
            characterSet.append(LOWERCASE);
        }
        if (includeUppercase) {
            characterSet.append(UPPERCASE);
        }
        if (includeNumbers) {
            characterSet.append(NUMBERS);
        }
        if (includeSpecial) {
            characterSet.append(SPECIAL_CHARACTERS);
        }
        if (characterSet.length() == 0) {
            throw new IllegalArgumentException("At least one character type must be selected.");
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterSet.length());
            password.append(characterSet.charAt(index));
        }

        return password.toString();
    }
}
