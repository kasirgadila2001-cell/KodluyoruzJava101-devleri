package donguler;
import java.util.Scanner;

public class OdevBir {

    public static void main(String[] args) {
        int sayi,sayac=0;
        int sum=0,sonuc;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        sayi = input.nextInt();

        for(int i=1; i<=sayi ; i++){
            if((i%3==0) && (i%4==0)) {
                sum += i;
                sayac += 1;

            }
        }
        sonuc = sum / sayac;
        System.out.println(sum);
        System.out.println(sayac);
        System.out.println("3'e ve 4'e tam bölünen sayıların ortalaması " + sonuc);

    }

}

