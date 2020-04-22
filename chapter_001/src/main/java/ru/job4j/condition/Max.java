package main.java.ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int average) {
        return average > max(left, right) ? average : max(left, right);
    }
}
