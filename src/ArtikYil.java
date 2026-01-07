import java.util.Scanner;

public class ArtikYil {
    static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl giriniz: ");
        yil = input.nextInt();

       if (yil % 100 == 0) {
            if(yil % 400 == 0){
                System.out.println(yil + " bir artık yıldır. ");
            }
            else {
            System.out.println(yil + " artık yıl değildir.");
            }

        }
       else if(yil % 4 == 0) {
           System.out.println(yil + " bir artık yıldır. ");
       }
       else{
           System.out.println(yil + "bir artık yıl değildir.");
       }
       }

    }

