import java.util.Scanner;

public class yinelenen_çift_sayı {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Dizi boyutunu giriniz: ");
    int n = scanner.nextInt();

    int[] arr = new int[n];

    System.out.println("Dizi elemanlarını giriniz: ");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    boolean[] seen = new boolean[n];

    for (int i = 0; i < n; i++) {
      if (arr[i] % 2 == 0 && seen[i] == false) {
        System.out.println(arr[i]);
        seen[i] = true;
      }
    }
  }
}
