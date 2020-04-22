package main.java.ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery mobile = new Battery(50);
        Battery powerbank = new Battery(50);
        System.out.println("До зарядки в телефоне: " + mobile.load
                + " до зарядки телефона в пауербанке: " + powerbank.load);
        mobile.exchange(powerbank);
        System.out.println("После зарядки в телефоне: " + mobile.load
                + " после зарядки телефона в пауербанке: " + powerbank.load);
    }
}