package homework_3.task_3;
import java.util.Scanner;
import java.util.Arrays;

// не забывай форматировать код
public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int [3];
        System.out.println("введите 3 значения для заполнения массива");
        for (int i=0;i<array.length;i++) {
            array[i] = scan.nextInt();
        }
        
        // логику по замене в отдельный метод
        int ostatok;
        for (int i = 0; i < array.length;i++) {
            ostatok=i%2; // думаю 16-17 строки можно объеденить
            if (ostatok == 0) {
                array[i] = 0;
            }
            System.out.println(array[i]);
        }
    }

}
// - перед отправкой ДЗ очищай код от такого
