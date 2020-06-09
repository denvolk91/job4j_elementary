package test.java.ru.job4j.stragery;

import main.java.ru.job4j.stragery.Paint;
import main.java.ru.job4j.stragery.Square;
import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        //this.loadOutput();
        new Paint().draw(new Square());
        //assertThat(
                //this.out.toString(),
                // //is(
                     //   new StringJoiner(System.lineSeparator())
                       //         .add("++++")
                         //       .add("+     +")
                           //     .add("+     +")
                             //   .add("++++")
                               // .toString()
             //   )
        //);
        //this.backOutput();
    }
}