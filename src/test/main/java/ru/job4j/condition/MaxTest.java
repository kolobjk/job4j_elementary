
package main.java.ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax4To2Then4() {
        int result = Max.max(4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax2To3To4Then4() {
        int result = Max.max(2, 3, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax2To3To4To5Then5() {
        int result = Max.max(2, 3, 4, 5);
        assertThat(result, is(5));
    }
}