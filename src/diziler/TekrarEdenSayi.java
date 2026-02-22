package diziler;
import java.util.Arrays;

public class TekrarEdenSayi {
    static void main(String[] args) {
        int[] list = new int[] {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        Arrays.sort(list);
        int sira = 0;
        for(int sayi : list){

            if(sira == sayi){
                System.out.println(sayi + " sayısı dizi içinde tekrar ediyor. ");
            }
            else {
                sira = sayi;
            }
        }
    }
}
