import java.util.Scanner;

public class harmonic_calculator {
   



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Dizi elemanlarını giriniz: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        double harmonicAverage = 0;

        for (int i = 0; i < n; i++) {
            harmonicAverage += 1.0 / arr[i];
        }

        harmonicAverage /= n;

        System.out.println("Dizideki sayıların harmonik ortalaması: " + harmonicAverage);
    }
}