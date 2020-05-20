package main.java.ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод возвращает копию массива items без null эллеиентов.
     * @return itemsWithoutNull массив без null
     */
    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            Item itemBuf = items[i];
            if (itemBuf != null) {
                itemsWithoutNull[position] = itemBuf;
                position++;
            }
            itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, position);
        }
        return itemsWithoutNull;
    }

    /**
     * Метод проверяет в цикле все эллементы массива item, сравнивая name с аргументом key.
     * Элементы, у которых совпадает name, копирует в результативный массив и возвращает в его.
     * @param key получение списка по имени.
     * @return массив совпавших имён.
     */
    public Item[] findByName(String key) {
        Item[] itemsWithoutEquals = new Item[items.length];

        for (int i = 0; i < items.length; i++) {
            if (items[i].getName().equals(key)) {
                itemsWithoutEquals[position] = items[i];
                position++;
            }
            itemsWithoutEquals = Arrays.copyOf(itemsWithoutEquals, position);
        }
        return itemsWithoutEquals;
    }

    /**
     * Метод проверяет в цикле все эллементы массива items, сравнивая id с аргументом String id
     * и возвращает найденный Item. Если не найдет, то null.
     * @param id получение заявки.
     * @return найденное совпадение или null.
     */
    public Item findById(String id) {
        Item[] idByItems = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            if (items[i].getId().equals(id)) {
                idByItems[position] = items[i];
            } else {
                idByItems[position] = null;
            }
            position++;
        }
        return idByItems[position];
    }
}