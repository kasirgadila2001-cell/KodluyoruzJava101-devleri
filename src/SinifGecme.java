import java.util.Scanner;

public class SinifGecme {
    static void main(String[] args) {

    int mat,turkce,fizik,kimya,muzik;
    Scanner inp = new Scanner(System.in);

    System.out.println("Lütfen 0 ile 100 arasında değer giriniz.");
    System.out.println("Matematik notunuz: ");
    mat = inp.nextInt();
    System.out.println("Türkçe notunuz: ");
    turkce = inp.nextInt();
    System.out.println("Fizik notunuz: ");
    fizik = inp.nextInt();
    System.out.println("Kimya notunuz: ");
    kimya = inp.nextInt();
    System.out.println("Müzik notunuz: ");
    muzik = inp.nextInt();

    double ort = ((mat+turkce+fizik+kimya+muzik)/5);
    if(ort <= 55){
        System.out.println("Sınıfta kaldınız. Ortalamanız. " + ort);
    }
    else {
        System.out.println("Tebrikler sınıfı geçtiniz. Ortalamanız: " +ort);
    }

    }
}
