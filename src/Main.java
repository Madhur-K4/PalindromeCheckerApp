import java.util.Scanner;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Palindrome version 7.0");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or number: ");
        String input = sc.nextLine();

        // Normalize input
        input = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        LinkedList<Character> list = new LinkedList<>();

        // Add characters to linked list
        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare first and last elements
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
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