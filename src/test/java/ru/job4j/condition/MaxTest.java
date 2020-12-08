package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    //проверка вывода максимального значения
    public void whenMax1ToMax2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    //проверка что перое значение left - это максимально значение
    public void whenMax1IsMoreThenMax2() {
        int left = 2, right = 1;
        boolean condition = left > right;
        int x = condition ? left : right;
        assertThat(x, is(left));
    }
    @Test
    //проверка что второе значение right - это максимальное значение
    public void whenMax2IsMoreThenMax1() {
        int left = 1, right = 2;
        boolean condition = left < right;
        int x = condition ? right : left;
        assertThat(x, is(right));
    }
    @Test
    //проверка что оба значение (left и right) равны, возврат любого из чисел
    public void whenMax1IsTheSameAsMax2() {
        int left = 2, right = 2;
        boolean condition = left == right;
        int x = condition ? right : left;
        assertThat(x, is(right));
    }
}