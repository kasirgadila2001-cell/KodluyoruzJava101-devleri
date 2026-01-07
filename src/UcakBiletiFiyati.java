import java.util.Scanner;

public class UcakBiletiFiyati {
    static void main(String[] args) {
        double mesafe,yas,tutar,indirim,digerindirim,yenitutar,gidisdonustutar;
        int tip;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen mesafe(KM), yaş ve tip bilgilerini giriniz. ");
        System.out.println("Mesafe KM cinsinden: ");
        mesafe = input.nextDouble();
        System.out.println("Yaşınız: ");
        yas = input.nextDouble();
        System.out.println("Tek yön için 1, Gidiş-Dönüş için 2'yi giriniz: ");
        tip = input.nextInt();

        if (!((mesafe>=1) && (yas>=1) && ((tip==1) || (tip == 2)))) {
            System.out.println("Hatalı veri girdiniz. ");
        }
        else {
            switch (tip) {
                case 1:

                if(yas<12){
                tutar = mesafe * 0.10;
                indirim = tutar * 0.50;
                yenitutar = tutar - indirim;
                    System.out.println("Toplam tutar: " +yenitutar);
                }
                else if(yas>=12 && yas<=24){
                    tutar = mesafe * 0.10;
                    indirim = tutar * 0.10;
                    yenitutar = tutar - indirim;
                    System.out.println("Toplam tutar: " +yenitutar);
                }
                else if(yas>=65){
                    tutar = mesafe * 0.10;
                    indirim = tutar * 0.30;
                    yenitutar = tutar - indirim;
                    System.out.println("Toplam tutar: " +yenitutar);
                }
                else {
                    tutar = mesafe * 0.10;
                    System.out.println("Toplam tutar: " +tutar);
                }
                break;

                case 2:
                    if(yas<12){
                        tutar = mesafe * 0.10;
                        indirim = tutar * 0.50;
                        yenitutar = tutar - indirim;
                        digerindirim =yenitutar * 0.20;
                        gidisdonustutar = yenitutar - digerindirim;
                        System.out.println("Toplam tutar: " +gidisdonustutar);
                    }
                    else if(yas>=12 && yas<=24){
                        tutar = mesafe * 0.10;
                        indirim = tutar * 0.10;
                        yenitutar = tutar - indirim;
                        digerindirim =yenitutar * 0.20;
                        gidisdonustutar = yenitutar - digerindirim;
                        System.out.println("Toplam tutar: " +gidisdonustutar);
                    }
                    else if(yas>=65){
                        tutar = mesafe * 0.10;
                        indirim = tutar * 0.30;
                        yenitutar = tutar - indirim;
                        digerindirim =yenitutar * 0.20;
                        gidisdonustutar = yenitutar - digerindirim;
                        System.out.println("Toplam tutar: " +gidisdonustutar);
                    }
                    else {
                        tutar = mesafe * 0.10;
                        digerindirim =tutar * 0.20;
                        gidisdonustutar = tutar - digerindirim;
                        System.out.println("Toplam tutar: " +gidisdonustutar);
                    }
                    break;
            }
        }
    }
}
