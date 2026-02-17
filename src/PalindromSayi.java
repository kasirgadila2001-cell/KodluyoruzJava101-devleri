import java.util.Scanner;

public class PalindromSayi {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber=0, lastNumber;
        while(temp!=0){
            lastNumber= temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp = temp / 10;
        }
        if(number == reverseNumber) {
            System.out.println("Girilen sayi Palindrom sayıdır: " +number + " ve " + reverseNumber);
            return true;
        }
        else {
            System.out.println("Girilen sayı Palindrom sayı değildir: " +number + " ve " + reverseNumber);
         return false;
    }
    }

    static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = inp.nextInt();

        System.out.println(isPalindrom(sayi) );

    }
}
