import java.util.Scanner;

public class KullaniciGirisi {
    static void main(String[] args) {

        String kullaniciAdi="dila",sifre="dila123",a,b,cevap,yeniSifre,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınız: ");
        a = input.nextLine();

        System.out.println("Şifreniz: ");
        b = input.nextLine();

        if (a.equals(kullaniciAdi) && b.equals(sifre)){
            System.out.println("Başarılı giriş yaptınız.");
        }

        else if(!b.equals(sifre)){
            System.out.println("Şifre sıfırlamak ister misiniz? Evet ya da hayır.");
            cevap = input.nextLine();
            if(cevap.equals("Evet")){
                System.out.println("Yeni bir şifre giriniz: ");
                yeniSifre = input.nextLine();
                if(!yeniSifre.equals(sifre)){
                    System.out.println("Şifre oluşturuldu.");
                }
                else{
                    System.out.println("Şifre oluşturulmadı. Lütfen başka şifre giriniz: ");
                    c = input.nextLine();
                    System.out.println("Şifre oluşturuldu. ");
                }
            }
            else {
                System.out.println("Yeniden deneyiniz. ");
            }
        }

    }
}
