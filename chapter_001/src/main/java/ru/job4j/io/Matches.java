package main.java.ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 11;
        boolean run = true;
        while (run && count > 0) {
            System.out.println("Ходит первый игрок");
            int player1 = Integer.valueOf(input.nextLine());
            if (player1 != 0 || player1 < 4) {
                count = count - player1;
                System.out.println("Осталось спичек: " + count);
            } else if (count == 0) {
                System.out.println("Выйграл первый");
                run = false;
            } else {
                System.out.println("Ошибка! Введите число от 1 до 3");
            }
        }
    }
}
