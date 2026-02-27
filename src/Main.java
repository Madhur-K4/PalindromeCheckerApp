import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Palindrome version 6.0");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or number: ");
        String input = sc.nextLine();

        // Normalize input
        input = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        Deque<Character> deque = new LinkedList<>();

        // Add characters to deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear elements
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("✅ It is a Palindrome!");
        } else {
            System.out.println("❌ Not a Palindrome.");
        }

        sc.close();
    }
}