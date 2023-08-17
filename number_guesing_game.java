import java.util.Random;
import java.util.Scanner;

public class number_guesing_game {

  public static void main(String[] args) {

    // Create a random number between 1 and 100
    int number = (int) (Math.random() * 100 + 1);

    // Prompt the user to enter a guess
    System.out.println("bir ile 100 arası sayı tahmin et: ");

    // Get the user's guess
    Scanner scan = new Scanner(System.in);
    int guess = scan.nextInt();

    // Check if the user's guess is correct
    while (guess != number) {
      if (guess < number) {
        System.out.println("tahminini yükselt.");
      } else {
        System.out.println("tahminini düşür.");
      }

      // Prompt the user to enter another guess
      System.out.println("1 ile 100 arası sayı tahmin et: ");

      // Get the user's guess
      guess = scan.nextInt();
    }

    // If the user's guess is correct, print a message
    if (guess == number) {
      System.out.println("tahmininiz dogru sayınız: " + number);
    }
  }
}