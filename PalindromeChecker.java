public interface PalindromeStrategy {
    boolean isPalindrome(String input);
}
public class ReverseStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        String normalized = input.toLowerCase()
                .replaceAll("[^a-zA-Z0-9]", "");

        String reversed = new StringBuilder(normalized).reverse().toString();

        return normalized.equals(reversed);
    }
}
import java.util.Stack;

public class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        String normalized = input.toLowerCase()
                .replaceAll("[^a-zA-Z0-9]", "");

        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) return false;
        }

        return true;
    }
}
public class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.isPalindrome(input);
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Palindrome version 11.0");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        // Choose strategy
        PalindromeStrategy strategy = new ReverseStrategy();

        PalindromeContext context = new PalindromeContext(strategy);

        boolean result = context.execute(input);

        if (result) {
            System.out.println("✅ It is a Palindrome!");
        } else {
            System.out.println("❌ Not a Palindrome.");
        }

        sc.close();
    }
}