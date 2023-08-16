import java.util.Scanner;

public class frekans {
     public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Dizi boyutunu giriniz: ");
    int n = scanner.nextInt();

    int[] arr = new int[n];

    System.out.println("Dizi elemanlarını giriniz: ");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    int[] frequencies = new int[n];
    for (int i = 0; i < n; i++) {
      int frequency = 1;
      for (int j = i + 1; j < n; j++) {
        if (arr[i] == arr[j]) {
          frequency++;
        }
      }
      frequencies[i] = frequency;
    }

    System.out.println("Dizi elemanları ve frekansları: ");
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i] + " " + frequencies[i]);
    }
  }
}
