package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    //тест что треугольник существует
    public void whenExist() {
        boolean result = Triangle.exist(3.0, 2.0, 3.0);
        assertThat(result, is(true));
    }

    @Test
    //тесть что треугольника не существует
    public void whenNotExist() {
        boolean result = Triangle.exist(3.0, 8.0, 2.0);
        assertThat(result, is(false));
    }
}