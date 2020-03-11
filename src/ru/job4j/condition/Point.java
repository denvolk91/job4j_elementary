package ru.job4j.condition;

public class Point {
    public static double distance(double x1, double y1, double x2, double y2) {
        double rsl = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 2, 2, 3);
        System.out.println("result (1, 2) to (2, 3) " + result);
    }
}
