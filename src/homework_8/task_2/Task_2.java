package homework_8.task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            integers.add(0, 1 + i);

        }
        System.out.println(integers);
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(integers);
    }
}
