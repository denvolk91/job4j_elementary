package main.java.ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public String go() {
        return null;
    }

    @Override
    public int passengers(int num) {
        return 0;
    }

    @Override
    public int fillUp(int numOil) {
        int price = numOil * 45;
        return price;
    }
}
