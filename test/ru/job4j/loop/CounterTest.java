package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    //Проверка что в диапазоне от 1 до 10 просуммируются все числа
    public void whenSumNumbersFromOneToTenFiftyFive() {
        int rsl = Counter.sum(1, 10);
        int expected = 55;
        assertThat(rsl, is(expected));
    }
    @Test
    //Проверка что в диапазоне от 3 до 8 просуммируются все числа
    public void whenSumNumbersFromThreeToEightThirtyThree() {
        int rsl = Counter.sum(3, 8);
        int expected = 33;
        assertThat(rsl, is(expected));
    }
    @Test
    //Проверка что в диапазоне от 1 до 1 просуммируются все числа
    public void whenSumNumbersFromOneToOneOne() {
        int rsl = Counter.sum(1, 1);
        int expected = 1;
        assertThat(rsl, is(expected));
    }

    @Test
    //Проверка что в диапазоне от 1 до 10 просуммируются все четные числа
    public void whenSumEventNumbersFromOneToTenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }
    @Test
    //Проверка что в диапазоне от 3 до 8 просуммируются все четные числа
    public void whenSumByEvenNumbersFromThreeToEightEighteen() {
        int rsl = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(rsl, is(expected));
    }
    @Test
    //Проверка что в диапазоне от 3 до 8 просуммируются все четные числа
    public void whenSumByEvenNumbersFromOneToOneZero() {
        int rsl = Counter.sumByEven(1, 1);
        int expected = 0;
        assertThat(rsl, is(expected));
    }
}