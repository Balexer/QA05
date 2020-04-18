package homework_2.task_7;

public class Task_7 {
    public static void main(String[] args) {
        int x = 1;
        int sum = 1;
        //sum = 1 потому что я не придумал как ее в цикл запихнуть
        while (x<99) {
            x=x+2;
            sum = sum + x;
        }
        System.out.println("сумма нечетных чисел от 1 до 99 = " + sum);
    }
}
