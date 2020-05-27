package main.java.ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = new Random().nextInt(3);

        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String answerUsed = input.nextLine();
        if (answer == 0) {
            System.out.println(answerUsed + " Да");
        } else if (answer == 1) {
            System.out.println(answerUsed + " Нет");
        } else {
            System.out.println(answerUsed + " Может быть");
        }
    }
}
