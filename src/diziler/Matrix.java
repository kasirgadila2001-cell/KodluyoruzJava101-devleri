package diziler;
import java.util.Scanner;

public class Matrix {
    static void main(String[] args) {
        int[][] matrix = new int[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Matrix dizisi için " + matrix.length + " satır ve " + matrix[0].length + " sütun değeri giriniz: ");

        for(int row =0 ; row < matrix.length ; row++){
            for(int column =0; column < matrix[row].length; column++){
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
    }
}
/* public class Matrix {public static void main(String[] args) {
    int[][] matris = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
    };

    for (int[] u : matris) {
        for (int elem : u) {
            System.out.println(elem);
        }
    }
}
}
*/ // bunda önce ilk satırı atıyor. Sonra satır içindekini tek tek atıyor.
