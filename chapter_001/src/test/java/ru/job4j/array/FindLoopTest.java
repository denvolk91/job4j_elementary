package test.java.ru.job4j.array;

import main.java.ru.job4j.array.FindLoop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHasNothing() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {3, 14, 4, 6, 5};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas6Then4() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {3, 14, 4, 6, 5};
        int value = 6;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

}