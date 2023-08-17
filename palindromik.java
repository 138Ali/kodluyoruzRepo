    import java.util.Scanner;
    public class palindromik {




  public static void main(String[] args) {

    // Create a Scanner object to read user input
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter a word
    System.out.println("bir kelime girin: ");

    // Get the user's input
    String word = scanner.next();

    // Check if the word is a palindrome
    boolean isPalindrome = true;
    for (int i = 0; i < word.length() / 2; i++) {
      if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
        isPalindrome = false;
        break;
      }
    }

    // Print the result
    if (isPalindrome) {
      System.out.println("kelime bir polindromdur");
    } else {
      System.out.println("kelime polindrom degil.");
    }
  }
}

