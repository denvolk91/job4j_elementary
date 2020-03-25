package main.java.ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++){
                table[i][j] = i * j + i + j + 1;
            }
        }
        return table;
    }
}
