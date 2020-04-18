package homework_2.task_4;

public class Task_4 {
    public static void main(String[] args) {
        int a = 6;
        int b = 6;
        int schetchik;
        int proizvedenie = 0;
        for (schetchik=0;schetchik!=b;schetchik++) {
            proizvedenie=a+proizvedenie;
        }
        System.out.println("A*B = " + proizvedenie);
    }
}
