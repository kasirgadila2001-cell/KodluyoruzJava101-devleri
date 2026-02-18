package donguler;
import java.util.Scanner;

public class UsHesabiYapma {
    static void usAlma() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Taban değerini giriniz: ");
            int taban = scan.nextInt();
            System.out.println("Üs değerini giriniz: ");
            int us = scan.nextInt();
            int result = 1;

            for (int i = 1; i <= us; i++) {
                result *= taban;
            }
            System.out.println("Sonuç: " + result);
        }
    }

    static void main(String[] args) {
        usAlma();

    }
}
