package ru.job4j.loop;

import org.junit.Test;
import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int rls = Factorial.calc(5);
        int expected = 120;
        assertThat(rls, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rls = Factorial.calc(0);
        int expected = 1;
        assertThat(rls, is(expected));
    }
}