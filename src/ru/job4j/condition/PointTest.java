package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import java.security.DrbgParameters;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(1, 2);
        Point b = new Point(2, 3);
        double expected = 1.41;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}
