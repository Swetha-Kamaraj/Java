import java.util.Scanner;

public class stringreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to be reversed: ");
        String word1 = sc.nextLine();

        // Check if the input is empty
        if (word1.isEmpty()) {
            System.out.println("You entered an empty string.");
            sc.close();
            return;
        }

        String word2 = "";

        for (int i = word1.length() - 1; i >= 0; i--) {
            word2 += word1.charAt(i);
        }

        System.out.println("Reversed string: " + word2);

        if (word1.equals(word2))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}
