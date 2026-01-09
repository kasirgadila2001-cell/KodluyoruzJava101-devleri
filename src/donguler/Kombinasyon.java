package donguler;
import java.util.Scanner;

public class Kombinasyon {
    static void main(String[] args) {
        int n,r,toplam =1,kombin =1,fark=1,sonuc;
        Scanner input = new Scanner(System.in);
        System.out.println("Kombinasyon için sayı giriniz: ");
        n=input.nextInt();
        System.out.println("Kaçlı kombinasyon istersiniz: ");
        r= input.nextInt();

        for(int i=1; i<=n; i++){
            toplam *= i;
        }
        for (int j=1 ; j<=r ; j++){
            kombin *= j;
        }
        for(int k=1; k<=(n-r) ; k++){
            fark *= k;
        }
        sonuc = toplam / (kombin * fark);
        System.out.println(sonuc);
    }
}
