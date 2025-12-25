import java.util.Scanner;

public class UcgenAlaniHesaplama {
    public static void main(String[] args){
        double a,b,c,u,alan,sonuc;
        Scanner kenar = new Scanner(System.in);

        System.out.println("Üç adet kenar uzunluğu giriniz. ");
        System.out.println("A kenarı: ");
        a = kenar.nextDouble();
        System.out.println("B kenarı: ");
        b = kenar.nextDouble();
        System.out.println("C kenarı: ");
        c = kenar.nextDouble();

        u = (a+b+c)/2;
        alan = u*(u-a)*(u-b)*(u-c);
        sonuc = Math.sqrt(alan);
        System.out.println("Üçgenin alanı: " +sonuc);




    }

}
