package donguler;
import java.util.Scanner;

public class EbobEkok {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1,sayi2;

        System.out.println("1. Sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.println("2. Sayıyı giriniz: ");
        sayi2 = input.nextInt();

        int n1 = sayi1;
        int n2 = sayi2;

        while (n2 != 0) {
            int kalan = n1 % n2;
            n1 = n2;
            n2 = kalan;
        }

        int ebob = n1;
        int ekok = (sayi1 * sayi2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
