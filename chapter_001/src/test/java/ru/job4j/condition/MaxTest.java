package test.java.ru.job4j.condition;

import main.java.ru.job4j.condition.Max;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        Max max = new Max();
        int result = max.max(2,1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To3Then3(){
        Max max = new Max();
        int result = max.max(2,2);
        assertThat(result, is(2));
    }
}
