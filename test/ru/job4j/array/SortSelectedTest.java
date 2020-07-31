package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort3() {
        int[] input = new int[] {33, 1, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 1, 33};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort5() {
        int[] input = new int[] {31, 14, 3, 3, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 3, 14, 31};
        assertThat(result, is(expect));
    }
}