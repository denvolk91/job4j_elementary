package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class Converter2Test {

    @Test
    public void rubleToEuro() {
        int inE = 140;
        int expected = 2;
        int outE = Converter.rubleToEuro(inE);
        Assert.assertEquals(expected, outE);
    }

    @Test
    public void rubleToDollar() {
    }
}