package diziler;

import java.util.Arrays;

public class MatrisTranspozu {
    static void main(String[] args) {
        int satir = 2, sutun = 3, a = 1, j;
        int[][] matris = new int[satir][sutun];
        System.out.println("Matris: ");
        for (int i = 0; i < matris.length; i++) {
            for (j = 0; j < matris[0].length; j++) {
                matris[i][j] = a;
                a++;
                System.out.print(matris[i][j] + " ");
            }
            if (j == matris[0].length) {
                System.out.println("\n");
            }
        }
        int b = 1;
        matris = new int[sutun][satir];

        System.out.println("Transpozu: ");
        for (int i = 0; i < matris.length; i++) {
            for (j = 0; j < matris[0].length; j++) {

                matris[i][j] = b;
                System.out.print(matris[i][j] + " ");
                b += 3;
            }
            b -= 5;
            if (j == matris[0].length) {
                System.out.println("\n");
            }



        }
    }
}
