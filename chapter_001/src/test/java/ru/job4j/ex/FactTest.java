package test.java.ru.job4j.ex;

import main.java.ru.job4j.ex.Fact;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenFact3() {
        int rsl = Fact.calc(-3);
        assertThat(rsl, is("Умножение на отрицательноечисло! " +
                "Проверьте входящие пераметры calc(int n)"));
    }
}
