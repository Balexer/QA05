package homework_3.task_5;
import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 1; i <= array.length / 2; i++) {
           swap(i-1,array.length - i, array);
        }
        System.out.println("================");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void swap(int left, int right, int[] array) {

        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
}
