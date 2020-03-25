package test.java.ru.job4j.array;

import main.java.ru.job4j.array.SortSelected;
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
    public void whenSortOfThree() {
        int[] input = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 4};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSortOfFive() {
        int[] input = new int[] {3, 6, 1, 4, 8};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 4, 6, 8};
        assertThat(result, is(expect));
    }
}
