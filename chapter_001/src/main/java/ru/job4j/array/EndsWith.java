package main.java.ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < word.length / 2; i ++) {
            char temp = word[i];
            word[i] = word[word.length - i - 1];
            word[word.length - i - 1] = temp;
        }
        for (int i = 0; i < post.length / 2; i ++) {
            char temp = post[i];
            post[i] = post[post.length - i - 1];
            post[post.length - i - 1] = temp;
        }
        for (int i = 0; i < post.length; i++) {
            if (post[i] != word[i]) {
                result = false;
            }
        }
        // проверить. что массив word имеет последние элементы одинаковые с post
        return result;
    }
}
