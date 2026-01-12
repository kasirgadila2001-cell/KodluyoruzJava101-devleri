package donguler;
import java.util.Scanner;

public class Atm {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciadi,parola;
        int paramiktari = 1500;
        int girishakki = 3;
        int secim;

        while(girishakki > 0){
            System.out.println("Kullanıcı adınız: ");
            kullaniciadi = input.nextLine();
            System.out.println("Şifreniz: ");
            parola = input.nextLine();

            if(kullaniciadi.equals("Dila") && parola.equals("5252")){
                System.out.println("Merhaba, kodluyoruz bankasına hoşgeldiniz. ");
                do {
                    System.out.println("1_Para Yatırma\n" + "2_Para Çekme\n" + "3_Bakiye Sorgulama\n" + "4_Çıkış");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    secim = input.nextInt();

                    switch (secim){
                        case 1:
                            System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                            int tutar = input.nextInt();
                            paramiktari += tutar;
                            System.out.println("Toplam bakiyeniz: " + paramiktari);
                            break;


                        case 2:
                            System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                            int cekim = input.nextInt();
                            if(cekim > paramiktari){
                                System.out.println("Bakiyeniz yetersiz! ");
                            }
                            else {
                                paramiktari -= cekim;
                                System.out.println("Toplam bakiyeniz: " + paramiktari);
                            }
                            break;


                        case 3:
                            System.out.println("Bankanızdaki bakiye miktarı: " + paramiktari);
                            break;

                        case 4:
                            System.out.println("İyi günler yine bekleriz.");
                            break;

                    }
                } while(secim != 4);


            }
            else {
                --girishakki;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz. ");
            }
            if (girishakki==0){
                System.out.println("Hesabınız bloke olmuştur. Banka ile iletişime geçiniz. ");
            }
            else
                System.out.println("Kalan giriş hakkınız: " + girishakki);


        }



    }
}
