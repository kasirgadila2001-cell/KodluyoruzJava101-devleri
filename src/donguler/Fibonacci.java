package donguler;
import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci serisi için adım sayısı giriniz: ");
        int adim = input.nextInt();
        int a=0, b=1;

        if(adim >=1 ){
            System.out.print(a + " ");
        }
        if(adim >= 2){
            System.out.print(b + " ");
        }
        for(int i=3; i <= adim; i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }



    }
}
