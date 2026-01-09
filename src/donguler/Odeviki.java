package donguler;
import java.util.Scanner;


public class Odeviki {
    static void main(String[] args) {
        int girilen,toplam =0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Sayı giriniz: ");
            girilen = input.nextInt();
            if((girilen%4==0)){
                toplam += girilen;
                System.out.println(toplam);
            }

        } while (girilen%2==0);
    }
}
