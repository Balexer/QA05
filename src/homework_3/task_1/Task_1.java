package homework_3.task_1;
import java.util.Scanner;
import java.util.Arrays;

// не забывай форматировать код
public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите 3 значения для заполнения массива");
        int[] array = new int [3];
        for (int i=0;i<array.length;i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
// пустая строка не нужна
// пустая строка не нужна
// пустая строка не нужна
    }
}
// - перед отправкой ДЗ очищай код от такого
