package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    //проверка что первое значение максимальное
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int x = 5, y = 4, z = 2;
        int result = check.max(x, y, z);
        assertThat(result, is(x));
    }
    @Test
    //проверка что второе значение максимальное
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int x = 1, y = 4, z = 2;
        int result = check.max(x, y, z);
        assertThat(result, is(y));
    }
    @Test
    //проверка что третье значение максимальное
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int x = 1, y = 4, z = 7;
        int result = check.max(x, y, z);
        assertThat(result, is(z));
    }
    @Test
    //проверка что все значения равны
    public void whenAllIsEqual() {
        MultiMax check = new MultiMax();
        int x = 1, y = 1, z = 1;
        boolean result = check.max(x, y, z) == x && y == z;
        assertTrue(result);
    }
}