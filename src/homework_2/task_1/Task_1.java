package homework_2.task_1;

public class Task_1 {
    public static void main(String[] args) {
        int day;
        double km_1 = 10;
        for (day = 2; day < 8; day++) {
            km_1 = km_1*1.1 + 10;
        }
        System.out.println("Столько спортсмен пробежит на 8 день = " + km_1);
    }
}
