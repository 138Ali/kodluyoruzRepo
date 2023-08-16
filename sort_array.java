import java.util.Arrays;
import java.util.Scanner;

public  class sort_array{



public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Dizi boyutunu giriniz: ");
    int n = scanner.nextInt();

    int[] arr = new int[n];

    System.out.println("Dizi elemanlarını giriniz: ");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    Arrays.sort(arr);

    System.out.println("Sıralı dizi: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  } 
    
}
