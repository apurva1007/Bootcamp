import java.util.Scanner;

/**
 * Created by ruplaga on 7/17/2017.
 */
public class GameOfLife {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of Board: ");
//        int boardSize = sc.nextInt();                               //can be any value. array is hardcoded here, so enter 3 as boardSize

//        System.out.println("Enter values: ");
//        currentGeneration = populateBoard(sc, currentGeneration, boardSize);            //user input for board configuration

        int boardSize = 3;

        int[][] currentGeneration = {{1, 1, 0}, {0, 1, 0}, {0, 0, 1}};         //hardcoded here. can take from user
        int[][] nextGeneration = new int[boardSize][boardSize];

        System.out.println("Current Generation:");
        printBoard(boardSize, currentGeneration);


        System.out.println("Enter the number of generations: ");
        int numberOfGenerations = sc.nextInt();

//        int numberOfGenerations = 3;                                                             // number of generations

        while (numberOfGenerations > 0) {
            getNewGeneration(boardSize, currentGeneration, nextGeneration);                        //get next generation
            System.out.println("Next Generation:");
            printBoard(boardSize, nextGeneration);
            currentGeneration = clear(currentGeneration, nextGeneration, boardSize);              //store nextGeneration values back to currentGeneration
            numberOfGenerations--;
        }
    }

    private static int[][] clear(int[][] currentGeneration, int[][] nextGeneration, int boardSize) {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                currentGeneration[i][j] = nextGeneration[i][j];
            }
        }
        return currentGeneration;
    }

    private static void getNewGeneration(int boardSize, int[][] board1, int[][] board2) {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                int count = getNeighboursCount(board1, i, j, boardSize);                //get count of neighbours
                int value = applyRules(count, board1[i][j]);                            //get value as 1 or 0 based on rules
                board2[i][j] = value;                                                   //store the new values in temp array board2
            }
        }
    }

    private static void printBoard(int boardSize, int[][] board) {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int applyRules(int count, int cell) {
        if (cell == 1) {                                 //cell is live
            if (count < 2)
                return 0;
            else if (count == 2 || count == 3)
                return 1;
            else if (count > 3)
                return 0;
        } else {                                          //cell is dead
            if (count == 3)
                return 1;
        }

        return 0;

    }

    static int getNeighboursCount(int[][] board, int i, int j, int boardSize) {
        int count = 0;

        for (int m = -1; m <= 1; m++) {
            for (int n = -1; n <= 1; n++) {
                if (board[getIndex(i + m, boardSize)][getIndex(j + n, boardSize)] == 1)
                    count++;
            }
        }
        if (board[i][j] == 1) {
            count--;
        }

        return count;

    }

    static int getIndex(int i, int boardSize) {
        if (i < 0)
            i = i + boardSize;
        return i % boardSize;
    }

    private static int[][] populateBoard(Scanner sc, int[][] board1, int boardSize) {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board1[i][j] = sc.nextInt();
            }
        }
        return board1;
    }
}
