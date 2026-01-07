import java.util.Scanner;

public class Burc {
    static void main(String[] args) {
        int gun,ay;
        Scanner input = new Scanner(System.in);

        System.out.println("Doğum tarihinizi gün ve ay olarak giriniz. ");
        System.out.println("Doğum günü: ");
        gun = input.nextInt();
        System.out.println("Doğum ayı: ");
        ay = input.nextInt();

        switch (ay) {
            case 1:
                if((gun>= 1) && (gun<=21)) {
                    System.out.println("Burcunuz Oğlak. ");
                }
                else
                    System.out.println("Burcunuz Kova. ");
                break;

            case 2:
                if(gun>=1 && gun<=19){
                    System.out.println("Burcunuz Kova. ");
                }
                else
                    System.out.println("Burcunuz Balık. ");
                break;

            case 3:
                if(gun>=1 && gun<=20){
                    System.out.println("Burcunuz Balık. ");
                }
                else
                    System.out.println("Burcunuz Koç. ");
                break;

            case 4:
                if(gun>=1 && gun<=20){
                    System.out.println("Burcunuz Koç. ");
                }
                else
                    System.out.println("Burcunuz Boğa. ");
                break;

            case 5:
                if(gun>=1 && gun<=21){
                    System.out.println("Burcunuz Boğa. ");
                }
                else
                    System.out.println("Burcunuz İkizler. ");
                break;

            case 6:
                if(gun>=1 && gun<=22){
                    System.out.println("Burcunuz İkizler. ");
                }
                else
                    System.out.println("Burcunuz Yengeç. ");
                break;

            case 7:
                if(gun>=1 && gun<=22){
                    System.out.println("Burcunuz Yengeç. ");
                }
                else
                    System.out.println("Burcunuz Aslan. ");
                break;

            case 8:
                if(gun>=1 && gun<=22){
                    System.out.println("Burcunuz Aslan. ");
                }
                else
                    System.out.println("Burcunuz Başak. ");
                break;

            case 9:
                if(gun>=1 && gun<=22){
                    System.out.println("Burcunuz Başak. ");
                }
                else
                    System.out.println("Burcunuz Terazi. ");
                break;

            case 10:
                if(gun>=1 && gun<=22){
                    System.out.println("Burcunuz Terazi. ");
                }
                else
                    System.out.println("Burcunuz Akrep. ");
                break;

            case 11:
                if(gun>=1 && gun<=21){
                    System.out.println("Burcunuz Akrep. ");
                }
                else
                    System.out.println("Burcunuz Yay. ");
                break;

            case 12:
                if(gun>=1 && gun<=21){
                    System.out.println("Burcunuz Yay. ");
                }
                else
                    System.out.println("Burcunuz Oğlak. ");
                break;
        }


    }
}
