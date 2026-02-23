package diziler;
import java.util.Scanner;
import java.util.Arrays;

public class DiziElemanSiralama {
    static void main(String[] args) {
        int eleman;
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz: ");
        int boyut = input.nextInt();
        int[] dizi = new int[boyut];
        System.out.println("Dizinin elemanlarını giriniz: ");
        for(int i=1; i <= boyut; i++){
                System.out.println(i + ". Elemanı: ");
                eleman = input.nextInt();
                dizi[i -1] = eleman;
        }
        Arrays.sort(dizi);
        System.out.println("Sıralama: " + Arrays.toString(dizi));

    }
}
