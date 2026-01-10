package donguler;
import java.util.Scanner;

public class ArmstrongSayi {
    static void main(String[] args) {
        int number,toplam =0,basamak;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriiniz: ");
        number = input.nextInt();

        while (number!=0){
            basamak = number % 10;
            toplam += basamak;
            number /= 10;
        }
        System.out.println(toplam);
    }
}
