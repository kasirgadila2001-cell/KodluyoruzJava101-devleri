package donguler;
import java.util.Scanner;

public class GelismisHesapMakinesi {
    static void plus(){
        Scanner input = new Scanner(System.in);
        int i=1 , number, result =0;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
            System.out.println("Sonuç : " + result);
        }

    }

    static void minus(){
        Scanner input = new Scanner(System.in);
        int i=1 , number, result =0;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result -= number;
            System.out.println("Sonuç : " + result);
        }

    }

    static void times(){
        Scanner input = new Scanner(System.in);
        int i=1 , number, result =1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = input.nextInt();
            if (number == 0 || number ==1) {
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void divided(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Tanımsız.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod(){
        Scanner input = new Scanner(System.in);
        System.out.println("Modu alınacak sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();
        int result = n1 % n2;
        System.out.println("Sonuç: " + result);
    }

    static void alan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin 1. kenarını giriniz: ");
        int n1 = input.nextInt();
        System.out.println("Dikdörtgenin 2. kenarını giriniz: ");
        int n2 = input.nextInt();
        int alan = n1 * n2;
        int cevre = (2 * n1) + (2 * n2);
        System.out.println("Dikdörtgenin alanı: " +alan);
        System.out.println("Dikdörtgenin çevresi: "+cevre);

    }


    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    alan();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

    }
}
