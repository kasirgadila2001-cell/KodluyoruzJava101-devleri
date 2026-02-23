package mayinTarlasiOyunu;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    String[][] board;      // Oyuncuya gösterilen harita
    String[][] mines;      // Mayınların olduğu harita
    int row, col;
    int mineCount;
    int openedCount = 0;

    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    public void start() {

        getBoardSize();
        initializeBoards();
        placeMines();
        playGame();
    }

    // Matris boyutunu kullanıcıdan al
    void getBoardSize() {
        while (true) {
            System.out.print("Satır sayısını girin: ");
            row = input.nextInt();
            System.out.print("Sütun sayısını girin: ");
            col = input.nextInt();

            if (row >= 2 && col >= 2) break;
            System.out.println("Matris boyutu minimum 2x2 olmalıdır. Tekrar deneyin.");
        }

        mineCount = (row * col) / 4;
    }

    // Dizileri oluştur
    void initializeBoards() {
        board = new String[row][col];
        mines = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = "-";
                mines[i][j] = "-";
            }
        }
    }

    // Mayınları yerleştir
    void placeMines() {
        int count = 0;

        while (count < mineCount) {
            int r = rand.nextInt(row);
            int c = rand.nextInt(col);

            if (!mines[r][c].equals("*")) {
                mines[r][c] = "*";
                count++;
            }
        }
    }

    // Oyunu başlat
    void playGame() {

        while (true) {
            printBoard();

            System.out.print("Satır girin: ");
            int r = input.nextInt();
            System.out.print("Sütun girin: ");
            int c = input.nextInt();

            if (!isValid(r, c)) {
                System.out.println("Geçersiz koordinat! Tekrar deneyin.");
                continue;
            }

            if (!board[r][c].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;
            }

            if (mines[r][c].equals("*")) {
                System.out.println("💣 Mayına bastınız! Oyun bitti.");
                showMines();
                break;
            }

            int mineAround = countMines(r, c);
            board[r][c] = String.valueOf(mineAround);
            openedCount++;

            if (openedCount == (row * col - mineCount)) {
                System.out.println("🎉 Tebrikler! Oyunu kazandınız!");
                printBoard();
                break;
            }
        }
    }

    // Sınır kontrolü
    boolean isValid(int r, int c) {
        return r >= 0 && r < row && c >= 0 && c < col;
    }

    // Komşu mayın sayısını hesapla
    int countMines(int r, int c) {
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newR = r + i;
                int newC = c + j;

                if (isValid(newR, newC) && mines[newR][newC].equals("*")) {
                    count++;
                }
            }
        }

        return count;
    }

    // Oyuncuya haritayı göster
    void printBoard() {
        System.out.println("\nHarita:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Mayınları göster (kaybedince)
    void showMines() {
        System.out.println("\nMayınların Konumu:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mines[i][j] + " ");
            }
            System.out.println();
        }
    }
}

