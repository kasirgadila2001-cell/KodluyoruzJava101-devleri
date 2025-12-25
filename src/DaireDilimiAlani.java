import java.util.Scanner;

public class DaireDilimiAlani {
    public static void main(String[] args) {
       double r,a,alan;
       Scanner input = new Scanner(System.in);

        System.out.println("Daire dilimi alanının hesaplanması için yarıçap ve merkez açı ölçüsü değerini giriniz.");
        System.out.println("Yarıçap: ");
        r = input.nextDouble();
        System.out.println("Merkez açısı: ");
        a = input.nextDouble();

        alan = (3.14 * (r*r) * a)/360;
        System.out.println("Daire diliminin alanı: " +alan);

    }
}
