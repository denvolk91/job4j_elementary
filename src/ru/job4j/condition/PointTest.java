package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import java.security.DrbgParameters;

public class PointTest {

    @Test
    public void distance() {
        double x1 = 1;
        double x2 = 2;
        double y1 = 2;
        double y2 = 3;
        double expected = 1.41;
        double out = Point.distance(1, 2, 2, 3);
        Assert.assertEquals(expected, out, 0.01);
    }

}
