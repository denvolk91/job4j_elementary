package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        return (height-110) * 1.15;
    }


    public static double womanWeight(double height) {
        return (height-110) * 1.15;
    }

    public static void main(String[] args) {
        double inM = 175;
        double inW = 160;
        double expectedM = 74.75;
        double expectedW = 57.5;

        boolean passedM = expectedM == manWeight(inM);
        boolean passedW = expectedW == womanWeight(inW);
        System.out.println("Идеальный вес мужчины при росте 175 равен 74,75. Test result : " + passedM);
        System.out.println("Идеальный вес женщины при росте 160 равен 57,5. Test result : " + passedW);

    }
}
