package homework_5.task_3;

public class Flat implements Types {
    // поля класса должны быть приватными!
    Integer floors;
    Boolean heating;
    Integer residents;

    public Flat(int floors, boolean heating, Integer residents) {
        this.floors = floors;
        this.residents = residents;
        this.heating = heating;
// пустая строка не нужна
    }

    // лучше переопредели метод toString() он как раз для этих целей
    public String show() {
        return "How many floors  " + this.floors + "; " + "How many residents  " + this.residents + "; " + "Is there any heating  " + this.heating;
    }


    @Override
    public void floors() {
        System.out.println(this.floors);
// пустая строка не нужна
    }

    @Override
    public void heating() {
        System.out.println(this.heating);
// пустая строка не нужна
    }

    @Override
    public void residents() {
        System.out.println(this.residents);
// пустая строка не нужна
    }
}
