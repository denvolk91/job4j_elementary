package main.java.ru.job4j.oop;

import java.awt.*;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // написать формулу для расчета площади треугольника.
        }
        return rsl;
    }

    private boolean exist(double a, double c, double b) {
       double ab = a + b;
       double ac = a + c;
       double bc = b + c;
       return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }
}
