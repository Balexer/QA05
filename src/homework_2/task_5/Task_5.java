package homework_2.task_5;

public class Task_5 {
    public static void main(String[] args) {
        int d;
        double s;
        // 20 в отдельную переменную
        for (d = 0; d<20; d++) { // for (int d = 0; d<20; d++) {
            s=d*2.54;
            System.out.println(d + " дюймов = " + s + " сантиметров");
        }
    }
}
