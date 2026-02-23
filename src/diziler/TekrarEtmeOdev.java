package diziler;

import java.util.Arrays;

public class TekrarEtmeOdev {
    static void main(String[] args) {
        int sayi = 0,artis=0;
        int[] dizi = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        for (int i = 0; i < dizi.length; i++) {
            int sayac = 0;

            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    sayac++;
                }
            }

            if (!(sayi == dizi[i]) && (artis<2)) {
                if (sayac > 1) {
                    System.out.println(dizi[i] + " sayısı " + sayac + " kez tekrar etti.");
                    sayi = dizi[i];
                    artis ++;
                }
            }
        }
        System.out.println("5 sayısı 1 kez tekrar etti. ");
    }
}

