package homework_2.task_2;

// +
public class Task_2 {
    public static void main(String[] args) {
        int hour;
        int klet = 1;

        for (hour = 0;hour < 24;) {
            hour = hour + 3;
            klet = klet * 2;
            System.out.println(klet + " клетки за " + hour + " часа ");
        }
    }
}
