import java.util.Scanner;

public class ManavKasasi {
    static void main(String[] args) {
        double armut = 2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.0;
        double armutkg, elmakg, domateskg, muzkg, patlicankg, tutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç kilo? ");
        armutkg = input.nextDouble();
        System.out.println("Elma kaç kilo? ");
        elmakg = input.nextDouble();
        System.out.println("Domates kaç kilo? ");
        domateskg = input.nextDouble();
        System.out.println("Muz kaç kilo? ");
        muzkg = input.nextDouble();
        System.out.println("Patlıcan kaç kilo? ");
        patlicankg = input.nextDouble();

        tutar = (armutkg*armut) + (elmakg*elma) + (domateskg*domates) + (muzkg*muz) + (patlicankg*patlican);
        System.out.println("Toplam manav tutarınız: " +tutar + "TL");
    }
}
