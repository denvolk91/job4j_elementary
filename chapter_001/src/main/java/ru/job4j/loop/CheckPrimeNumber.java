package main.java.ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;

        for(int i = 0; i <= number; i++){
            for(int j = 2; j < number; j++){
                if (i%j == 0) {
                    prime = false;
                    break;
              } else {
                    prime = true;
                }
            }
        }
        return prime;
    }
}
