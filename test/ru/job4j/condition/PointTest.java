package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void testDistance() {
        int in1 = 5, in2 = 10, in3 = 25, in4 = 25;
        double expected = 5;
        double out = Point.distance(in1, in2, in3, in4);
        Assert.assertEquals(expected, out, 0.01);
    }
}