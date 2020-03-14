package test.java.ru.job4j.loop;

import main.java.ru.job4j.loop.Counter;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumNumbersFromZeroToTenThenFiftyFive() {
        int rsl = Counter.sum(0, 10);
        int expected = 55;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumNumbersFromThreeToEightThenThirtyThree() {
        int rsl = Counter.sum(3, 8);
        int expected = 33;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumNumbersFromOneToOneThenOne() {
        int rsl = Counter.sum(1, 1);
        int expected = 1;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumEvenNumbersFromZeroToTenThenThirty() {
        int rsl = Counter.sumByEven(0, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumEvenNumbersFromThreeToEightThenEighteen() {
        int rsl = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumEvenNumbersFromOneToOneThenOne() {
        int rsl = Counter.sumByEven(1, 1);
        int expected = 0;
        assertThat(rsl, is(expected));
    }
}
