import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Palindrome version 9.0");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        // Normalize input: ignore case and spaces
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        String reversed = "";

        // Reverse normalized string
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }

        if (normalized.equals(reversed)) {
            System.out.println("✅ It is a Palindrome!");
        } else {
            System.out.println("❌ Not a Palindrome.");
        }

        sc.close();
    }
}