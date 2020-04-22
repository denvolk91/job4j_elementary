package main.java.ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Дом";
    }

    public static void main(String[] args) {
        DummyDic user = new DummyDic();
        String eng = user.engToRus("Home");
        System.out.println("Неизвестное слово. " + eng);
    }
}
