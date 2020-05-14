package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;


public class FitnessTest {

    @Test
    public void whenGreatNik() {
        int month = Fitness.calc(95, 90);
        assertThat(month, is(0));
    }
    @Test
    public void whenIvanLessNik() {
        int month = Fitness.calc(90, 95);
        assertThat(month, is(1));
    }
    @Test
    public void whenIvanLessByFewNik() {
        int month = Fitness.calc(50, 95);
        assertThat(month, is(1));
    }
}