package donguler;
import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elmasın yarı yüksekliğini giriniz: ");
        int n = scanner.nextInt();

        // ÜST KISIM
        for (int i = 1; i <= n; i++) {

            // Boşluklar
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Yıldızlar
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // ALT KISIM
        for (int i = n - 1; i >= 1; i--) {

            // Boşluklar
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Yıldızlar
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
