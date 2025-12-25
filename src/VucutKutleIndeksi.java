import java.util.Scanner;

public class VucutKutleIndeksi {
    static void main(String[] args) {
        double boy,kilo,indeks;
        Scanner input = new Scanner(System.in);

        System.out.println("Kg cinsinden kilonuzu giriniz: ");
        kilo = input.nextDouble();
        System.out.println("Metre cinsinden boyunuzu giriniz: ");
        boy = input.nextDouble();


        indeks = kilo / (boy*boy);
        System.out.println("Vücut kütle indeksiniz: " + indeks);

    }
}
