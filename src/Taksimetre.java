import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args){
        double km,toplam;
        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi km olarak giriniz: ");
        km = input.nextDouble();
        toplam = (km * 2.20) + 10;
        if(toplam <= 20){
            System.out.println("Taksimetre ücretiniz 20 TL");
        }
        else{
            System.out.println("Taksimetre ücretiniz " +toplam + "TL");
        }

    }
}
