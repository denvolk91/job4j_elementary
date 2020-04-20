package main.java.ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0;
        for (int k = 0; k < rsl.length; k++) {
            if (i > left.length - 1) {
                int temp = right[j];
                rsl[k] = temp;
                j++;
            } else if (j > right.length - 1) {
                int temp = left[i];
                rsl[k] = temp;
                i++;
            } else if (left[i] < right[j]) {
                rsl[k] = left[i];
                i++;
            } else {
                int buffer = right[j];
                rsl[k] = buffer;
                j++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
