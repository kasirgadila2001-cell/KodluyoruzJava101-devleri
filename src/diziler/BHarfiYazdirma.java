package diziler;

public class BHarfiYazdirma {
    public static void main(String[] args) {

        int satir = 7;
        int sutun = 5;

        String[][] dizi = new String[satir][sutun];

        for(int i = 0; i < satir; i++){
            for(int j = 0; j < sutun; j++){

                if(j == 0 ||
                        (i == 0 || i == 3 || i == 6) && j < sutun-1 ||
                        j == sutun-1 && (i != 0 && i != 3 && i != 6)){

                    dizi[i][j] = "*";
                } else {
                    dizi[i][j] = " ";
                }
            }
        }


        for(int i = 0; i < satir; i++){
            for(int j = 0; j < sutun; j++){
                System.out.print(dizi[i][j]);
            }
            System.out.println();
        }
    }
}
