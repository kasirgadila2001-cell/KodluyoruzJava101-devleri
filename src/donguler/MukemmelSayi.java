package donguler;
import java.util.Scanner;

public class MukemmelSayi {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int N = input.nextInt();
        int toplam=0;

        for ( int i=1 ; i < N; i++){
            if(N%i==0){
               toplam += i;
            }
        }
        if(N == toplam){
            System.out.println(N + " bir mükemmel sayıdır.");
        }
        else
            System.out.println(N + " bir mükemmel sayı değildir.");
    }
}
