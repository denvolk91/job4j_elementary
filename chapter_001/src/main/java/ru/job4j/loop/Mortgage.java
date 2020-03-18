package main.java.ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double balance = amount;
        while (balance > 0 ){
            balance = ((balance + ((balance / 100) * percent)) - salary);
            if(balance < 0){
                year++;
            } else {
                year++;
            }
        }
        return year;
    }
}
