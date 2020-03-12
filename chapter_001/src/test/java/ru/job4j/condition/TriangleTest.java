package test.java.ru.job4j.condition;

import main.java.ru.job4j.condition.Triangle;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExistTrue() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenExistFalse(){
        boolean result = Triangle.exist(2.0, 2.0, 5.0);
        assertThat(result, is(false));
    }
}
