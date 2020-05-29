package main.java.ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 11;
        boolean run = true;
        System.out.println("Ходит первый игрок, возьмите от 1 до 3 спичек.");
        while (run) {
            int num = Integer.valueOf(input.nextLine());
            if (num > 0 && num < 4) {
                count = count - num;
                if (count <= 0) {
                    System.out.println("Игра завершена. Вы победитель!");
                run = false;
                } else if (count > 0) {
                    System.out.println("Осталось спичек: " + count);
                    System.out.println("Ходит следующий");
                }
            } else {
                System.out.println("Ошибка! Введите число от 1 до 3");
            }
        }
    }
}
