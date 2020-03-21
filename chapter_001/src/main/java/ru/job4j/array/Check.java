package main.java.ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] == data[i] && data[i] == data[data.length - 1] && data [0] == true) {
                result = true;
            } else if (data[0] == data[i] && data[i] == data[data.length - 1] && data [0] == false) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
