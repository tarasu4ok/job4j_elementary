package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

    @Test
    public void whenDoesntHaveMonoHorizontal() {
        char[][] input = {
                {'X', 'X', ' '},
                {'X', 'X', ' '},
                {'X', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 0);
        assertThat(result, is(false));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenDoesNotHaveMonoVertical() {
        char[][] input = {
                {'X', 'X', 'X'},
                {' ', 'X', 'X'},
                {'X', ' ', ' '},
        };
        boolean result = MatrixCheck.monoVertical(input, 0);
        assertThat(result, is(false));
    }
}