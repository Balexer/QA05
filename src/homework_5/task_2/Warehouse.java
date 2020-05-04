package homework_5.task_2;

import java.util.Arrays;

public class Warehouse {
    private Integer[] array;

    public Warehouse(Integer[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public String toString() {
        return " Array= " + Arrays.toString(array);
    }

    public void next() {
        for (int i = 0; i <= array.length; i++) {
            if (i == array.length) {
                System.out.println(array[0]);
            } else {
                System.out.println(array[i]);
            }
        }
    }

    public Integer[] getArray() {
        return array;
    }
}
