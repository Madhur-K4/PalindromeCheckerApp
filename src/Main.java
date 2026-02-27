import java.util.Scanner;

class PalindromeService {

    public boolean isPalindrome(String input) {

        if (input == null) return false;

        String normalized = input.toLowerCase()
                .replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Palindrome version 10.0");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        PalindromeService service = new PalindromeService();

        boolean result = service.isPalindrome(input);

        if (result) {
            System.out.println("✅ It is a Palindrome!");
        } else {
            System.out.println("❌ Not a Palindrome.");
        }

        sc.close();
    }
}