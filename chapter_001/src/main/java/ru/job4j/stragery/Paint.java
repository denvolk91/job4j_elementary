package main.java.ru.job4j.stragery;

public class Paint {
    public void draw(Shape shape) {
        System.out.print(shape.draw());
    }

    public static void main(String[] args) {
        Paint pn = new Paint();
        pn.draw(new Triangle());
        System.out.println();
        pn.draw(new Square());
    }
}
