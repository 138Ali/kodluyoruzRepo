import java.util.Scanner;

public class closest_numbers {
   

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Dizi boyutunu giriniz: ");
            int n = scanner.nextInt();
    
            int[] arr = new int[n];
    
            System.out.println("Dizi elemanlarını giriniz: ");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
    
            System.out.print("Aranan sayıyı giriniz: ");
            int target = scanner.nextInt();
    
            int closestSmallerNumber = arr[0];
            int closestGreaterNumber = arr[n - 1];
    
            for (int i = 0; i < n; i++) {
                if (arr[i] < target && Math.abs(arr[i] - target) < Math.abs(closestSmallerNumber - target)) {
                    closestSmallerNumber = arr[i];
                }
                if (arr[i] > target && Math.abs(arr[i] - target) < Math.abs(closestGreaterNumber - target)) {
                    closestGreaterNumber = arr[i];
                }
            }
    
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmallerNumber);
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestGreaterNumber);
        }
    }
