import java.util.Scanner;

public class star_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz: ");
        int n = scanner.nextInt();

        char[][] arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1) {
                    arr[i][j] = '*';
                } else {
                    arr[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
      }
      }
    
