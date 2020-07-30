package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int input[] = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHasNotElement() {
        int input[] = {5, 4, 3, 2};
        int value = 1;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas10Then5() {
        int input[] = {11, 20, 5, 6, 7, 10};
        int value = 10;
        int result = FindLoop.indexOf(input, value);
        int expect = 5;
        assertThat(result, is(expect));
    }
}