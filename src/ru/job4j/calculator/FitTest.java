package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight(){
        double inM = 175;
        double expectedM = 74.75;
        double outM = Fit.manWeight(inM);
        Assert.assertEquals(expectedM, outM, 0.01);

    }

    @Test
    public void womanWeight(){
        double inW = 160;
        double expectedW = 57.49999999999999;
        double outW = Fit.manWeight(inW);
        Assert.assertEquals(expectedW, outW, 0.01);

    }

}
