package homework_7.task_8;

import java.util.Arrays;

// Стоит сделать хранилище, в нем массив Car и у Car сделать поле с двигателем
public class Task_8 {
    public static void main(String[] args) {
        String[] array = {"1.4", "3.0", "1.4", "2.0", "1.8"};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == "1.4") { // классы сравниваем только через equals()
                array[i] = "2.0T";
            }
            if (array[i] == "1.8") { // классы сравниваем только через equals()
                array[i] = "1.8T";
            }
        }
        System.out.println(Arrays.toString(array));
        //Пробовал через replace но ничего не работало, поэтому сделал так.
        
    }
}
