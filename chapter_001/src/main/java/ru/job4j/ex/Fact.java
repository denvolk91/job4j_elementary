package main.java.ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        System.out.println("Факториал числа 3: " + calc(3));
    }

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Умножение на отрицательноечисло! " +
                    "Проверьте входящие пераметры calc(int n)");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
