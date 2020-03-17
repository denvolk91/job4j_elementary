package main.java.ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for(int i = 1; i <= number; i++){
            if((i%number) == 0){
                prime = true;
                break;
            } else {
                prime = false;
            }
        }
        return prime;
    }
}
