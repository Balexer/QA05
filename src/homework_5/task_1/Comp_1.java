package homework_5.task_1;

// Comp_1 - я думаю название стоит поменять. Есть же много марок компьютеров
public class Comp_1 implements Computer {
    @Override
    public void powerOn() {
        System.out.println("Computer turned on");
    }

    @Override
    public void powerOff() {
        System.out.println("Computer shut down");

    }

    @Override
    public void reset() {
        System.out.println("reset");

    }
}
