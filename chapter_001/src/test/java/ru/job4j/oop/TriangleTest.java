package test.java.ru.job4j.oop;

import main.java.ru.job4j.oop.Triangle;
import org.junit.Test;

import java.awt.*;
import org.junit.Assert;


public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
        double out = triangle.area();
        double expected = 2;
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenAreaSetThreePointsNotTriangleArea() {
        Point a = new Point(1, 0);
        Point b = new Point(0, 2);
        Point c = new Point(0, 3);
        Triangle triangle = new Triangle(a, b, c);
        double out = triangle.area();
        double expected = 0.5;
        Assert.assertEquals(expected, out, 0.1);
    }
}
