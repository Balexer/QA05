package homework_8.task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        int countElem = 100;
        / заполнение в отдедьный метод
        for (int i = 0; i <= countElem; i++) {
            integers.add(0, 1 + i);

        }
        System.out.println(integers);
        / удаление в отедьный метод
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
// абзац думаю здесь не особо нужен
        System.out.println(integers);
    }
}
