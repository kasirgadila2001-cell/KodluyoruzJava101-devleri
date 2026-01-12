package donguler;
import java.util.Scanner;

public class TersUcgen {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Basamak sayısı giriniz: ");
        n = input.nextInt();

        for(int i=n ; i>=1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
        }
            System.out.println("");
        }
    }
}
