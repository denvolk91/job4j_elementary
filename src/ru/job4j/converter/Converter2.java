package ru.job4j.converter;

public class Converter2 {
    public static int rubleToEuro(int value) {
        return value / 70;
    }


    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int inE = 140;
        int inD = 120;
        int expected = 2;
        int outE = rubleToEuro(inE);
        int outD = rubleToDollar(inD);
        boolean passedE = expected == outE;
        boolean passedD = expected == outD;
        System.out.println("140 rubles are 2. Test result : " + passedE);
        System.out.println("120 rubles are 2. Test result : " + passedD);
    }
}
