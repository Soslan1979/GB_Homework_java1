import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    final char SING_X = 'x';
    final char SING_O = '0';
    final char SING_EMPTY = '.';
    char[][] table;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    TicTacToe() {
        table = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);
    }

    void game() {
        initTable();
        while (true) {
            printTable();
            turnHuman();
            if (isWin(SING_X)) {
                System.out.println("You win!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, draw");
                break;
            }
            turnAi();
            if (isWin(SING_O)) {
                System.out.println("AI win!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, draw");
                break;
            }
        }
        printTable();
    }

    void initTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = SING_EMPTY;
            }
        }
    }

    void printTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[j][i] + " ");
            }
            System.out.println();
        }

    }

    void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter [1..3] x, y: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = SING_X;
    }

    void turnAi() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = SING_O;

    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || x > 2 || y < 0 || y > 2) {
            return false;
        }
        return table[x][y] == SING_EMPTY;
    }

    boolean isWin(char ch) {
        for (int i = 0; i < 3; i++) {
            if (table[0][i] == ch && table[1][i] == ch && table[2][i] == ch) return true; // x
            if (table[i][0] == ch && table[i][1] == ch && table[i][2] == ch) return true; // y
            if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true; // диагональ
            if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true; // диагональ
        }
        return false;
    }

    boolean isTableFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == SING_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

}
