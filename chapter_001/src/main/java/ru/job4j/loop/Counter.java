package main.java.ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum;
        for (sum = 0; start <= finish; start++) {
            sum += start;
        }
        return sum;
    }
    public static int sumByEven(int start, int finish) {
        int sum;
        for ( sum = 0; start <= finish; start++) {
            if ( (start%2) == 0) {
                sum += start ;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}
