import java.util.Scanner;

public class HesapMakinasi {
    static void main(String[] args) {
        int n1,n2,select,sonuc;
        Scanner input = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1_Toplama\n2_Çıkarma\n3_Çarpma\n4_Bölme");
        System.out.println("Seçiminiz: ");
        select = input.nextInt();

        switch(select){
            case 1:
             sonuc = n1 + n2;
                System.out.println("Sonuç: " +sonuc);
                break;

            case 2:
                sonuc = n1 - n2;
                System.out.println("Sonuç: " +sonuc);
                break;
            case 3:
                sonuc = n1 * n2;
                System.out.println("Sonuç: " +sonuc);
                break;
            case 4:
                sonuc = n1 / n2;
                System.out.println("Sonuç: " +sonuc);
                break;
            default:
                System.out.println("Yanlış bir değer girdiniz.");
        }
    }
}
