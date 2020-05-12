package homework_7.task_6;

import java.util.Arrays;

public class Task_6 {

    public static void main(String[] args) {
        String[] array = {"Work", "gold", "war", "main"};
        int arraySize = 0;
        int j = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i].toUpperCase().startsWith("W")) {
                arraySize++;
            }
        }
        String[] newArray = new String[arraySize];
        for (int i = 0; i < array.length; i++) {
            if (array[i].toUpperCase().startsWith("W")) {
                newArray[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArray));

    }
}
