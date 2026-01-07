import java.util.Scanner;

public class SayiSiralama {
    static void main(String[] args) {
        int a,b,c;
        Scanner inp = new Scanner(System.in);
        System.out.println("3 adet sayı giriniz: ");
        System.out.println("1.Sayı: ");
        a = inp.nextInt();
        System.out.println("2.Sayı: ");
        b = inp.nextInt();
        System.out.println("3.Sayı: ");
        c = inp.nextInt();

        if((a>b) && (a>c)){
            if(b>c){
                System.out.println("c < b < a");
            }
            else
                System.out.println("b < c < a");
        }
        else if ((b>a) && (b>c)){
            if(a > c){
                System.out.println("c < a < b");
            }
            else
                System.out.println(" a < c < b");
        }
        else {
            if(a > b){
                System.out.println(" b < a < c");
            }
            else
                System.out.println(" a < b < c");
        }
    }
}
