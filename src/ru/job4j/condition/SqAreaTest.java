package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        double p = 6;
        double k = 2;
        double expekted = 2;
        double out = SqArea.square(6, 2);
        Assert.assertEquals(expekted, out, 0.1);

    }
}
