package homework_2.task_8;

public class Task_8 {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        while (x<100) {
            x = x + 2;
            sum = sum + x;
        }
        System.out.println("Сумма четных чисел от 1 до 100 = " + sum);
        x = 1;
        sum = 1;
        while (x<99) {
            x=x+2;
            sum = sum + x;
        }
        System.out.println("Сумма нечетных чисел от 1 до 100 = " + sum);
        x=0;
        sum = 0;
        while (x<100) {
            x++;
            sum = sum + x;
        }
        System.out.println("Сумма всех числе от 1 до 100 = " + sum);

    }
}
