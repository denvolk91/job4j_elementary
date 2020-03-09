package ru.job4j.converter;

public class Converter2 {
    public static int rubleToEuro(int value) {
        return value / 70;
    }


    public static int rubleToDollar(int value) {
        return value / 65;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(130);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("130 rubles are " +dollar + " dollar.");
        int inE = 140;
        int inD = 130;
        int expected = 2;
        int outE = rubleToEuro(inE);
        int outD = rubleToDollar(inD);
        boolean passedE = expected == outE;
        boolean passedD = expected == outD;
        System.out.println("140 rubles are 2. Test result : " + passedE);
        System.out.println("130 rubles are 2. Test result : " + passedD);
    }
}
