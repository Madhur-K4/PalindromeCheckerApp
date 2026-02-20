//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Palindrome version 2.0");
    }
    Scanner sc = new Scanner(System.in);

       System.out.print("Enter a word: ");
    String input = sc.nextLine();

    String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
        reversed += input.charAt(i);
    }

        if (input.equals(reversed)) {
        System.out.println("It is a Palindrome!");
    } else {
        System.out.println("Not a Palindrome.");
    }

        sc.close();
}

