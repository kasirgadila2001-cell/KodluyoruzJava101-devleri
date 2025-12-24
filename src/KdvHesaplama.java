import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args){
        double tutar,kdvTutari,kdvTutarliMiktari,kdvTutarliMiktar,kdvTutar,kdvOrani = 0.18,kdvBuyukOran = 0.08;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextInt();
        if (tutar <= 1000) {
            kdvTutar = tutar * kdvOrani;
            kdvTutarliMiktar = tutar + kdvTutar;
            System.out.println(kdvTutarliMiktar);
        }
        else if (tutar >= 1000 ){
             kdvTutari = tutar * kdvBuyukOran;
             kdvTutarliMiktari = tutar + kdvTutari;
            System.out.println(kdvTutarliMiktari);
        }



    }
}
