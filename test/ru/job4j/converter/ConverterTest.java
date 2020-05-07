package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;


public class ConverterTest {

    @Test
    public void whenConvert140RubleToEuro() {
        float in = 140;
        double expected = 2;
        double out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0);
    }

    @Test
    public void whenConvert140RubleToDollar() {
        float in = 140;
        double expected = 2.3333333;
        double out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.0000001);
    }
}