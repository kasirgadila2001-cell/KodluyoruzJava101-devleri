package donguler;
import java.util.Scanner;

public class UsluSayi {
    static void main(String[] args) {
        int n,k,sonuc=1 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı: ");
        n= input.nextInt();
        System.out.println("Üs olacak sayı: ");
        k= input.nextInt();
        for(int i=1 ; i <= k ; i++){
            sonuc *= n;

        }
        System.out.println(sonuc);
    }
}
