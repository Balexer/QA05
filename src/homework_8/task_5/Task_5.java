package homework_8.task_5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task_5 {
    public static void main(String[] args) {
        int quantity = 100000;
        ArrayList<Integer> integ = new ArrayList<>();
        for (int i = 0; i <= quantity; i++) {
            integ.add(0, 1);
        }
        Long start = System.currentTimeMillis();
        for (int i = 0; i <= quantity; i++) {
            int mid = integ.size() / 2;
            integ.remove(mid);
        }
        Long finish = System.currentTimeMillis();
        System.out.println("Результат проверки ArrayList " + (finish-start));

        LinkedList<Integer> integ1 = new LinkedList<>();
        for (int j = 0; j <= quantity; j++) {
            integ1.add(0, 1);
        }
        Long start1 = System.currentTimeMillis();
        for (int j = 0; j <= quantity; j++) {
            int mid = integ1.size() / 2;
            integ1.remove(mid);
        }
        Long finish1 = System.currentTimeMillis();

        System.out.println("Результат проверки LinkedList " + (finish1 - start1));

    }
}
