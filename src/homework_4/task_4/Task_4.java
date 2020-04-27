package homework_4.task_4;

import homework_4.task_1.Apple;

public class Task_4 {
    public static void main(String[] args) {
        Apple p_1 = new Apple();
        Apple p_2 = new Apple();
        Apple p_3 = new Apple();
        System.out.println(p_1.showForText());
        System.out.println(p_2.showForText());
        System.out.println(p_3.showForText()); //проверочка
        p_1.setText ("setText");
        System.out.println(p_1.showForText());
        System.out.println(p_2.showForText());
        System.out.println(p_3.showForText());
        System.out.println("Так случилось потому что, static поле присваивается всем экземплярам класса");
    }
}
