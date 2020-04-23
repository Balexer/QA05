package homework_3.task_4;
import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {
        int[][] array = new int[9][9];

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * (j + 1);
            }
        }

        for (int i = 1; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }


}
//