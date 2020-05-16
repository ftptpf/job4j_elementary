package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class CheckPrimeNumberTest {

    @Test
    public void what5() {
        boolean rls = CheckPrimeNumber.check(5);
        assertThat(rls, is(true));
    }
    @Test
    public void what4() {
        boolean rls = CheckPrimeNumber.check(4);
        assertThat(rls, is(false));
    }
    @Test
    public void what1() {
        boolean rls = CheckPrimeNumber.check(1);
        assertThat(rls, is(false));
    }
}