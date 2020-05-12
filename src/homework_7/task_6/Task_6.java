package homework_7.task_6;

import java.util.Arrays;

public class Task_6 {

    public static void main(String[] args) {
        String[] array = {"Work", "gold", "war", "main"};
        int arraySize = 0; // arraySize не очень понятное название, filteredArraySize думаю лучше подойдет
        int j = 0; // заводи переменную максимально близко к месту ее использования
        
                // эту логику в отдельный метод
        for (int i = 0; i < array.length; ++i) {
            if (array[i].toUpperCase().startsWith("W")) {
                arraySize++;
            }
        }
        // эту логику в отдельный метод
        String[] newArray = new String[arraySize]; 
        for (int i = 0; i < array.length; i++) {
            if (array[i].toUpperCase().startsWith("W")) {
                newArray[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArray));
// пустая строка не нужна
    }
}
