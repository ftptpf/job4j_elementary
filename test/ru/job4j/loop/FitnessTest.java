package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;


public class FitnessTest {

    @Test
    //Показатели Ивана лучше чем у Никиты
    public void whenIvanGreatNik() {
        int month = Fitness.calc(95, 90);
        assertThat(month, is(0));
    }

    @Test
    //Показатели Ивана хуже чем у Никиты
    public void whenIvanLessNik() {
        int month = Fitness.calc(90, 95);
        assertThat(month, is(1));
    }

    @Test
    //Показатели Ивана намного хуже чем у Никиты
    public void whenIvanLessByFewNik() {
        int month = Fitness.calc(50, 95);
        assertThat(month, is(2));
    }

    @Test
    //Показатели Ивана такие же как у Никиты
    public void whenIvanTheSameNik() {
        int month = Fitness.calc(90, 90);
        assertThat(month, is(1));
    }
}