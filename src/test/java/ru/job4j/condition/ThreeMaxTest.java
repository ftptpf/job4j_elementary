package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ThreeMaxTest {

    @Test
    //максимальне первое значение
    public void firstMax() {
        int rls = ThreeMax.max(10, 5, 1);
        assertThat(rls, is(10));
    }
    @Test
    //максимальне второе значение
    public void secondMax() {
        int rls = ThreeMax.max(10, 50, 1);
        assertThat(rls, is(50));
    }
    @Test
    //максимальне третье значение
    public void thirdMax() {
        int rls = ThreeMax.max(10, 5, 100);
        assertThat(rls, is(100));
    }
    @Test
    //все значения равны
    public void allEquals() {
        int rls = ThreeMax.max(1, 1, 1);
        assertThat(rls, is(1));
    }
    @Test
    //первое значение равно второму
    public void firstEqualsSecond() {
        int rls = ThreeMax.max(10, 10, 1);
        assertThat(rls, is(10));
    }
    @Test
    //первое значение равно третьему
    public void firstEqualsThird() {
        int rls = ThreeMax.max(100, 1, 100);
        assertThat(rls, is(100));
    }
    @Test
    //второе значение равно третьему
    public void secondEqualsThird() {
        int rls = ThreeMax.max(1, 100, 100);
        assertThat(rls, is(100));
    }
}