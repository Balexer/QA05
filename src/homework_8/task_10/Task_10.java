package homework_8.task_10;

import homework_8.task_8.Shop;

import java.util.*;

public class Task_10 {
    public static void main(String[] args) {
        List<Fruits> sklad = new ArrayList<>();
        Fruits fruit_1 = new Fruits(1, "banana");
        Fruits fruit_2 = new Fruits(2, "banana");
        Fruits fruit_3 = new Fruits(3, "aple");
        Fruits fruit_4 = new Fruits(2, "aple");
        sklad.add(fruit_1);
        sklad.add(fruit_2);
        sklad.add(fruit_3);
        sklad.add(fruit_4);

        System.out.println(sklad);
        Map<Integer, Fruits> accountingJournal = new HashMap<>();
        accountingJournal.put(1, fruit_1);
        accountingJournal.put(2, fruit_2);
        accountingJournal.put(3, fruit_3);
        accountingJournal.put(4, fruit_4);
        System.out.println(accountingJournal);
        for (Fruits value : accountingJournal.values()) {
            System.out.println("Value: " + value);
        }

    }
} // Я не знаю как сделац
/ задачу разобрали на занятии
