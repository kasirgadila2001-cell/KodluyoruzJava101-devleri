import java.util.Scanner;

public class EtkinlikOnerisi {
    static void main(String[] args) {
        int sicaklik,a,b,c,d;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz. ");
        sicaklik= inp.nextInt();
        if(sicaklik<=5){
            System.out.println("Kayak yapabilirsin.");
        }
        else if (sicaklik>5 && sicaklik<=15) {
            System.out.println("Sinemaya gidebilirsin.");
        }
        else if (sicaklik>15 && sicaklik<=25) {
            System.out.println("Pikniğe gidebilirsin");
        }
        else
            System.out.println("Yüzmeye gidebilirsin.");

    }
}
