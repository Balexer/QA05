package homework_3.task_2;
import java.util.Scanner;
import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int [3];
        System.out.println("введите 3 значения для заполнения массива");
        for (int i=0;i<array.length;i++) {
            array[i] = scan.nextInt();
        }
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg = (array[i] + avg);
        }
        avg = avg/array.length;
        System.out.println("Среднее арифмитическое массива = " + avg);

    }
}
//