import java.util.Scanner;
import java.util.Stack;

public class Main {

    // Normalize input
    public static String normalize(String input) {
        return input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    }

    // Strategy 1: Reverse String
    public static boolean reverseMethod(String input) {
        String normalized = normalize(input);
        String reversed = new StringBuilder(normalized).reverse().toString();
        return normalized.equals(reversed);
    }

    // Strategy 2: Stack
    public static boolean stackMethod(String input) {
        String normalized = normalize(input);
        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) return false;
        }

        return true;
    }

    // Strategy 3: Two Pointer (Optimized)
    public static boolean twoPointerMethod(String input) {
        String normalized = normalize(input);

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

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Palindrome version 12.0 — Performance Comparison");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        // Reverse Method Timing
        long start1 = System.nanoTime();
        boolean r1 = reverseMethod(input);
        long end1 = System.nanoTime();

        // Stack Method Timing
        long start2 = System.nanoTime();
        boolean r2 = stackMethod(input);
        long end2 = System.nanoTime();

        // Two Pointer Timing
        long start3 = System.nanoTime();
        boolean r3 = twoPointerMethod(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Reverse Method: " + r1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method: " + r2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Two Pointer Method: " + r3 +
                " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}