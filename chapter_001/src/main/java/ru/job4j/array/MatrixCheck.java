package main.java.ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = row; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
                if (board[i][j] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
