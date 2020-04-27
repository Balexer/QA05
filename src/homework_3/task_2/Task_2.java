package homework_3.task_2;
import java.util.Scanner;
import java.util.Arrays;

// не забывай форматировать код
public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int [3];
        System.out.println("введите 3 значения для заполнения массива");
        for (int i=0;i<array.length;i++) {
            array[i] = scan.nextInt();
        }
        int avg = 0;
        // подсчет среднего в отдельный метод
        for (int i = 0; i < array.length; i++) {
            avg = (array[i] + avg); // зачем скобки?
        }
        avg = avg/array.length; // если получится дробное число, то ответ будет некорректным
        System.out.println("Среднее арифмитическое массива = " + avg);
// пустая строка не нужна
    }
}
// - перед отправкой ДЗ очищай код от такого
