package main.java.ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Отображение всех заявок ===");
                System.out.println(tracker.findAll());
            } else if (select == 2) {
                System.out.println("=== Замена заявки в старую ячейку ===");
                System.out.print("ВВедите номер заявки которую хотите заменить: ");
                String id = scanner.nextLine();
                System.out.print("Ведите новое имя заявки: ");
                String newName = scanner.nextLine();
                Item newItem = new Item(newName);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Успешная замена");
                    run = true;
                } else {
                    System.out.println("Ошибка! Замена имя заявки которую хотите изменить не найдено.");
                    run = false;
                }
            } else if (select == 3) {
                System.out.println("=== Удалите заявку ===");
                System.out.print("Введите имя заявки которую хотите удалить: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                String id = item.getId();
                if (tracker.delete(id)) {
                    System.out.println("Успешное удаление");
                } else {
                    System.out.println("Ошибка! Введеное имя заявки не существует.");
                    run = false;
                }
            } else if (select == 4) {
                System.out.println("=== Поиск заявки по номеру ===");
                System.out.print("Введите ");
                String id = scanner.nextLine();
                Item item = new Item(id);
                tracker.findById(item.getId());
                System.out.println(item.getName());
            } else if (select == 5) {
                System.out.println("=== Поиск списка заявок по совпавшим именам ===");
                System.out.print("Введите имя для получения списка: ");
                String name = scanner.nextLine();
                System.out.println(tracker.findByName(name));
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by Id.");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit Program.");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
