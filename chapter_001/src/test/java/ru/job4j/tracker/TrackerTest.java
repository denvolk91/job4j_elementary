package test.java.ru.job4j.tracker;

import main.java.ru.job4j.tracker.Item;
import main.java.ru.job4j.tracker.Tracker;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void itemsWithoutNullTest() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        Item itemNull = new Item(null);
        tracker.add(item);
        tracker.add(itemNull);
        Item[] result = tracker.findAll();
        Item[] provided = {item};
        assertThat(result, is(provided));
    }
}