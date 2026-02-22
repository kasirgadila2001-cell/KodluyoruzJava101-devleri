package diziler;
import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayiDiziler {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        Arrays.sort(list);

        for(int dizi : list){
            if(sayi<dizi){
                System.out.println("Girilen sayıdan büyük en yakın sayı: " + dizi);
                int index = Arrays.binarySearch(list, dizi);
                System.out.println("Girilen sayıdan küçük en yakın sayı: " + list[index-1]);
                break;
            }
        }
    }
}
