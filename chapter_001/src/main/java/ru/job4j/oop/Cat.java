package main.java.ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println("Кот " + this.name + " " + "ел " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.giveNick("Барсик");
        barsik.eat("Вискас");
        barsik.show();
    }
}
