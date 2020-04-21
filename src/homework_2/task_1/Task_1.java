package homework_2.task_1;

public class Task_1 {
    public static void main(String[] args) {
        int day;
        double km_1 = 10;
        // магическое число 8 в отдельную переменную, если я верно помню, то кол-во дней = 7,тогда получается след-ее:
        // for (day = 1; day < 7; day++) {
        for (day = 2; day < 8; day++) {
            km_1 = km_1*1.1 + 10;
        }
        System.out.println("Столько спортсмен пробежит на 8 день = " + km_1);
    }
}
