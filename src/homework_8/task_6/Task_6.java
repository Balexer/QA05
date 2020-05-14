package homework_8.task_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_6 {
    public static void main(String[] args) {
        int count = 90000;
        ArrayList<Integer> arrayIntegers = new ArrayList<>();

        add(arrayIntegers, count);

        Long start = System.currentTimeMillis();
        remove(arrayIntegers);
        Long finish = System.currentTimeMillis();
        System.out.println("Результат проверки ArrayList " + (finish - start));

        LinkedList<Integer> linkedIntegers = new LinkedList<>();
        add(linkedIntegers, count);

        Long start1 = System.currentTimeMillis();
        remove(linkedIntegers);

        Long finish1 = System.currentTimeMillis();

        System.out.println("Результат проверки LinkedList " + (finish1 - start1));
    }

    private static void add(List<Integer> list, int count) {
        for (int i = 0; i <= count; i++) {
            list.add(1);
        }
    }

    private static void remove(List<Integer> list) {
        while (list.size() > 0) {
            list.remove(0);
        }
    }
}
