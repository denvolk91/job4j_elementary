package main.java.ru.job4j.book;

public class Library {
    public static void main(String[] args) {
        Book kolobok = new Book("Колобок", 10);
        Book mumu = new Book("Му-му", 50);
        Book repka = new Book("Репка", 5);
        Book cleanCode = new Book("Clean code", 320);

        Book[] books = new Book[4];

        books[0] = kolobok;
        books[1] = mumu;
        books[2] = repka;
        books[3] = cleanCode;

        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Поменяем местами книги с индеком 0 и 3:");
        Book temp3and0 = books[0];
        books[0] = books[3];
        books[3] = temp3and0;

        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Выведем книгу с именем Clean code:");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
}
