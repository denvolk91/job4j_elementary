package main.java.ru.job4j.array;


public class ArrayDefinition {
    public static void main(String[] args) {
        short [] ages = new short[10];
        String [] surnames = new String[100500];
        float [] prices = new float[40];
        String [] names = new String[4];
        names[0] = "Вася Пупкин";
        names[1] = "Валера Голошин";
        names[2] = "Гадя Хренова";
        names[3] = "Валя Горлопанова";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
