package homework_8.task_10;

import homework_8.task_8.Shop;

import java.math.BigDecimal;
import java.util.*;

public class Task_10 {
    public static void main(String[] args) {
        List<Fruits> warehouse = new ArrayList<>();
        Fruits banana = new Fruits(BigDecimal.valueOf(2.3), "banana");
        Fruits kiwi = new Fruits(BigDecimal.valueOf(1), "kiwi");
        Fruits aple = new Fruits(BigDecimal.valueOf(5.2), "aple");
        Fruits orange = new Fruits(BigDecimal.valueOf(1.2), "orange");
        warehouse.add(banana);
        warehouse.add(kiwi);
        warehouse.add(kiwi);
        warehouse.add(aple);
        warehouse.add(orange);
        warehouse.add(orange);
        warehouse.add(orange);
        System.out.println(warehouse);

        Map<String, BigDecimal> accountingJournal = fruitsWeight(warehouse);
        System.out.println(accountingJournal);
    }
    public static Map<String, BigDecimal> fruitsWeight(List<Fruits> warehouse) {
        Map<String, BigDecimal> accountingJournal = new HashMap<>();
        for (int i = 0; i < warehouse.size(); i++) {
            Fruits fruit = warehouse.get(i);
            BigDecimal weight = accountingJournal.get(fruit.getName());
            accountingJournal = countWeight(accountingJournal, weight, fruit);
        }
        return accountingJournal;
    }
    public static Map<String, BigDecimal> countWeight(Map<String, BigDecimal> accountingJournal, BigDecimal weight, Fruits fruit) {
        if (weight == null) {
            accountingJournal.put(fruit.getName(), fruit.getWeight());
        } else {
            accountingJournal.put(
                    fruit.getName(), weight.add(fruit.getWeight())
            );
        }
        return accountingJournal;
    }
} // Я не знаю как сделац
// задачу разобрали на занятии
