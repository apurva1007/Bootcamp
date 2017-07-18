import java.util.Scanner;

/**
 * Created by ruplaga on 7/17/2017.
 */
public class Board1 {

    static int checkWinner(int[][] boardPosition, int boardSize) {

        for (int j = 0; j < boardSize; j++) {
            if(sumOfRows(boardPosition, j, boardSize) == boardSize) {
                return 1;
            } else if (sumOfRows(boardPosition, j, boardSize) == 0)
                return 0;
        }

        for (int i = 0; i < boardSize; i++) {
            if(sumOfColumns(boardPosition, i, boardSize) == boardSize) {
                return 1;
            } else if (sumOfColumns(boardPosition, i, boardSize) == 0)
                return 0;
        }

        int sumDiagonalOne = checkFirstDiagonal(boardPosition, boardSize);
        if (sumDiagonalOne != 2) {
            return sumDiagonalOne;
        }

        int sumDiagonalTwo = checkSecondDiagonal(boardPosition, boardSize);
        if (sumDiagonalTwo != 2) {
            return sumDiagonalTwo;
        }
        return 2;
    }

    private static Integer checkSecondDiagonal(int[][] boardPosition, int boardSize) {
        int sum = 0;
        for (int i = 0, j = boardSize-1; i < boardSize; i++, j--){
            sum += boardPosition[i][j];
        }
        if(sum == boardSize)
            return 1;
        else if(sum == 0)
            return 0;
        return 2;
    }

    private static Integer checkFirstDiagonal(int[][] boardPosition, int boardSize) {
        int sum = 0;
        for (int i = 0; i < boardSize; i++){
            sum += boardPosition[i][i];
        }
        if(sum == boardSize) {
            return 1;
        }
        else if(sum == 0) {
            return 0;
        }
        return 2;
    }

    private static int sumOfColumns(int[][] boardPosition, int i, int boardSize) {
        int sum = 0;
        for (int j = 0; j < boardSize; j++) {
            sum += boardPosition[i][j];
        }
        return sum;
    }

    private static int sumOfRows(int[][] boardPosition, int j, int boardSize) {
        int sum = 0;
        for (int i = 0; i < boardSize; i++) {
            sum += boardPosition[i][j];
        }
        return sum;
    }

    private static int[][] populateBoard(Scanner sc, int[][] boardPosition, int boardSize) {
        for( int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                boardPosition[i][j] = sc.nextInt();
            }
        }
        return boardPosition;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Board: ");
        int boardSize = sc.nextInt();

        int[][] boardPosition = new int[boardSize][boardSize];

        System.out.println("Enter values: ");
        boardPosition = populateBoard(sc, boardPosition, boardSize);

        int winner = checkWinner(boardPosition, boardSize);
        if(winner == 2) {
            System.out.println("Draw");
        } else {
            System.out.println("Winner:" + winner);
        }
    }
}
