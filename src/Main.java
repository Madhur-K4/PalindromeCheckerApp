import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Palindrome version 2.0");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or number: ");
        String input = sc.nextLine();

        // Convert to lowercase and remove special characters
        input = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Convert string to character array
        char[] arr = input.toCharArray();

        boolean isPalindrome = true;

        int left = 0;
        int right = arr.length - 1;

        // Compare characters from both ends
        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("✅ It is a Palindrome!");
        } else {
            System.out.println("❌ Not a Palindrome.");
        }

        sc.close();
    }
}
