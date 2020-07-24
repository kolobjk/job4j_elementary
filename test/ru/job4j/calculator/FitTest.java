package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManWeight200ThenHeight115() {
        int expected = 115;
        short height = 200;
        double out = Fit.manWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }
}