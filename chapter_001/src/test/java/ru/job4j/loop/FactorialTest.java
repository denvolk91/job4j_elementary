package test.java.ru.job4j.loop;

import main.java.ru.job4j.loop.Factorial;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int rs1 = Factorial.calc(5);
        int expected = 120;
        assertThat(rs1, is(expected)); //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rs1 = Factorial.calc(0);
        int expected = 1;
        assertThat(rs1, is(expected));
    }
}
