package homework_8.task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        int countElem = 100;

       fillingOut(integers,countElem);
        System.out.println(integers);
        removeEven(integers);
        System.out.println(integers);
    }
    public static void fillingOut(List<Integer> list, int quantityOfElements) {
        for (int i = 0; i <= quantityOfElements; i++) {
            list.add(0, 1 + i);

        }
    }
    public static void removeEven(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
    }
}
