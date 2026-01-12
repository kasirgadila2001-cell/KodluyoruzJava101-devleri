package donguler;
import java.util.Scanner;

public class AsalSayi {
    static void main(String[] args) {

        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asalMi = true;

            for (int i = 2; i <= sayi / 2; i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                System.out.print(sayi + " ");
            }
        }
    }
}
