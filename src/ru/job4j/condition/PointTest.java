package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import java.security.DrbgParameters;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(2, 3, 4);
        double expected = 1.41;
        double expected3d = 1.73;
        double out = a.distance(b);
        double out3d = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
        Assert.assertEquals(expected3d, out3d, 0.01);
    }

}
