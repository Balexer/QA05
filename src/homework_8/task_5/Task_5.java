package homework_8.task_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_5 {
    public static void main(String[] args) {
        int quantity = 100000;
        ArrayList<Integer> arrayInteger = new ArrayList<>();
        add(arrayInteger, quantity);
        Long start = System.currentTimeMillis();
        remove(arrayInteger);

        Long finish = System.currentTimeMillis();
        System.out.println("Результат проверки ArrayList " + (finish - start));

        LinkedList<Integer> linkedInteger = new LinkedList<>();
        add(linkedInteger, quantity);

        Long start1 = System.currentTimeMillis();

        remove(linkedInteger);

        Long finish1 = System.currentTimeMillis();

        System.out.println("Результат проверки LinkedList " + (finish1 - start1));

    }

    private static void add(List<Integer> list, int count) {
        for (int i = 0; i <= count; i++) {
            list.add(1);
        }
    }

    private static void remove(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int mid = list.size() / 2;
            list.remove(mid);
        }
    }
}
