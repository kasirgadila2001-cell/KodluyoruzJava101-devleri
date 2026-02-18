package donguler;
import java.util.Scanner;

public class Desen {
    static void desen(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int n = scan.nextInt();
        int result = n;
        System.out.println("N sayısı: " +n);
        System.out.print("Çıktısı: " + n + " ");
        while(result > 0) {
                result -= 5;
            System.out.print(result + " ");
        }
        while(result <= 0){
            while(result < n){
            result += 5;
            System.out.print(result + " ");

            }
        }
    }

    static void main(String[] args) {
        desen();

    }
}
