package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(5, 3, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(7, 1, 12);
        assertThat(result, is(12));
    }

    @Test
    public void whenAllEqual() {
        int result = MultiMax.max(3, 3, 3);
        assertThat(result, is(3));
    }
}