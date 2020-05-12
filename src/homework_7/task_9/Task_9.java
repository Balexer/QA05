package homework_7.task_9;

public class Task_9 {
    public static void main(String[] args) {
        String[] array = {"work again", "war", "gold", "minaaaa"};
        for (int i = 0; i < array.length; ++i) {
            if (array[i].length() > 5) { //5 в переменную
                System.out.println(array[i]);
            }
        }
    }
}
