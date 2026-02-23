package sonOdevler;
import java.util.Scanner;
import java.util.Random;

public class SayiTahminOyunu {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi = (int)(Math.random() * 100);
        int sayac=5,tahmin;

        do {
            System.out.println("0-100 arasında sayı tahmin ediniz: ");
            tahmin = input.nextInt();
            if (!(sayi == tahmin)) {
                if(sayac==0){
                    System.out.println("Tahmin hakkınız kalmadı. Kaybettiniz. Tutulan sayının değeri: " + sayi);
                    break;
                }
                sayac--;
                System.out.println("Yanlış tahminde bulundunuz. Kalan hakkınız: " + sayac);
            }
        } while(!(sayi==tahmin));

        if(sayi==tahmin){
            System.out.println("Tebrikler doğru tahmin ettiniz. Tutulan sayı: " + sayi);
        }
    }
}
