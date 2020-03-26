package main.java.ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
                board[row][i] = 'X';
                if (board[row][i] != 'X') {
                    result = false;
                    break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
                board[i][column] = 'X';
                if (board[i][column] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (i == j) {
                    rsl[i] = board[i][j];
                }
            }
        }
        return rsl;
    }
}
