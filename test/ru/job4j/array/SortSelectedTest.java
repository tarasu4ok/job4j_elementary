package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void when3Sort() {
        int[] input = new int[] {5, 2, 8};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 5, 8};
        assertThat(result, is(expect));
    }

    @Test
    public void when5Sort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void when5SortWithEqualValues() {
        int[] input = new int[] {3, 3, 1, 1, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 1, 2, 3, 3};
        assertThat(result, is(expect));
    }
}