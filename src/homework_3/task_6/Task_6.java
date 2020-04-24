package homework_3.task_6;
import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int[] array = {8, 2, 4, 3, 6};
        // schet -> evenNumbers
        int schet = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                schet++;
            }
        }

        // arrayZ - переименуй
        int[] arrayZ = new int[schet];
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                arrayZ[num] = array[i];
               num++;
            }
        }
            System.out.println(Arrays.toString(arrayZ));
// пустая строка не нужна
// пустая строка не нужна
    }
}
// - перед отправкой ДЗ очищай код от такого
