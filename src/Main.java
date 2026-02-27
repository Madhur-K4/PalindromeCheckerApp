import java.util.Scanner;

public class Main {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int left, int right) {

        // Base case: pointers crossed or same
        if (left >= right) {
            return true;
        }

        // If mismatch occurs
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Palindrome version 8.0");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or number: ");
        String input = sc.nextLine();

        // Normalize input
        input = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("✅ It is a Palindrome!");
        } else {
            System.out.println("❌ Not a Palindrome.");
        }

        sc.close();
    }
}