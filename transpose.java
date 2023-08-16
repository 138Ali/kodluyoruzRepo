import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Matris boyutunu giriniz: ");
    int n = scanner.nextInt();

    int[][] matrix = new int[n][n];

    System.out.println("Matris elemanlarını giriniz: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    int[][] transpose = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        transpose[j][i] = matrix[i][j];
      }
    }

    System.out.println("Matrisin transpozu: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(transpose[i][j] + " ");
      }
      System.out.println();
    }
  }
}
