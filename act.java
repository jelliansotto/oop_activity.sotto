import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class act {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text;

        System.out.println("===== REGULAR EXPRESSION PATTERN MATCHING =====");

        System.out.print("\nEnter a string (digits only): ");
        text = input.nextLine();

        if (Pattern.matches("[0-9]+", text)) {
            System.out.println("Valid: Only digits.");
        } else {
            System.out.println("Invalid: Not digits only.");
        }

        System.out.print("\nEnter a string (letters only): ");
        text = input.nextLine();

        if (text.matches("[a-zA-Z]+")) {
            System.out.println("Valid: Only letters.");
        } else {
            System.out.println("Invalid: Not letters only.");
        }

        System.out.print("\nEnter a string (letters and numbers): ");
        text = input.nextLine();

        if (text.matches("[a-zA-Z0-9]+")) {
            System.out.println("Valid: Letters and numbers.");
        } else {
            System.out.println("Invalid: Contains special characters.");
        }

        System.out.print("\nEnter a string (starts with Java): ");
        text = input.nextLine();

        if (text.matches("Java.*")) {
            System.out.println("Valid: Starts with Java.");
        } else {
            System.out.println("Invalid: Does not start with Java.");
        }

        System.out.print("\nEnter a string (ends with .com): ");
        text = input.nextLine();

        if (text.matches(".*\\.com")) {
            System.out.println("Valid: Ends with .com.");
        } else {
            System.out.println("Invalid: Does not end with .com.");
        }

        System.out.print("\nEnter a string (exactly 5 digits): ");
        text = input.nextLine();

        if (text.matches("[0-9]{5}")) {
            System.out.println("Valid: Exactly 5 digits.");
        } else {
            System.out.println("Invalid: Must contain exactly 5 digits.");
        }

        System.out.print("\nEnter a string (at least 8 characters): ");
        text = input.nextLine();

        if (text.matches(".{8,}")) {
            System.out.println("Valid: At least 8 characters.");
        } else {
            System.out.println("Invalid: Less than 8 characters.");
        }

        System.out.print("\nEnter a string (contains whitespace): ");
        text = input.nextLine();

        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Valid: Contains whitespace.");
        } else {
            System.out.println("Invalid: No whitespace found.");
        }

        input.close();

        System.out.println("\n===== PROGRAM ENDED =====");
    }
}
