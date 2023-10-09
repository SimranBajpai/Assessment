import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Remove spaces and convert the input to lowercase
        input = input.replaceAll(" ", "").toLowerCase();

        // Create a set to store unique characters
        Set<Character> uniqueChars = new HashSet<>();

        // Iterate through the input string
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                uniqueChars.add(ch);
            }
        }

        // Check if the set size is 26 (number of letters in the alphabet)
        return uniqueChars.size() == 26;
    }
}
