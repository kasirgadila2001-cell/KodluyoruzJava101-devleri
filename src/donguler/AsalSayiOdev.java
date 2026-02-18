package donguler;
import java.util.Scanner;

public class AsalSayiOdev {
    static void asal() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Sayı giriniz: ");
            int sayi = scan.nextInt();


            for (int i = 2; i <= sayi; i++) {
                if (sayi % i == 0 && sayi != i) {
                    System.out.println(sayi + " sayısı asal değildir !");
                    break;

                }
                if (sayi == i)
                    System.out.println(sayi + " sayısı asal sayıdır !");

            }

        }
    }

    static void main(String[] args) {
        asal();
    }
}
