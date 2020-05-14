package homework_8.task_6;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task_6 {
    public static void main(String[] args) {
        int b = 100000;
        ArrayList<Integer> arrayIntegers = new ArrayList<>();
        for (int i = 0; i <= b; i++) {
            arrayIntegers.add(0, 1);
        }
        Long start = System.currentTimeMillis();
        for (int i = 0; i <= b; i++) {
            arrayIntegers.remove(0);
        }
        Long finish = System.currentTimeMillis();
        System.out.println("Результат проверки ArrayList " + (finish-start));

        LinkedList<Integer> linkedIntegers = new LinkedList<>();
        for (int j = 0; j <= b; j++) {
            linkedIntegers.add(0, 1);
        }
        Long start1 = System.currentTimeMillis();
        for (int j = 0; j <= b; j++) {
            linkedIntegers.remove(0);
        }
        Long finish1 = System.currentTimeMillis();

        System.out.println("Результат проверки LinkedList " + (finish1 - start1));


    }
}
