package homework_3.task_7;

import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*(array.length+1));
        }
        System.out.println(Arrays.toString(array));
        boolean toSort = true;
        while (toSort) {
            toSort = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = tmp;
                    toSort = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
//