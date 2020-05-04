package homework_5.task_3;

public class House implements Types {
    Integer floors;
    Boolean heating;
    Integer residents;

    public House(int floors, boolean heating, Integer residents) {
        this.floors = floors;
        this.residents = residents;
        this.heating = heating;

    }

    public String show() {
        return "How many floors  " + this.floors + "; " + "How many residents  " + this.residents + "; " + "Is there any heating  " + this.heating;
    }


    @Override
    public void floors() {
        System.out.println(this.floors);

    }

    @Override
    public void heating() {
        System.out.println(this.heating);

    }

    @Override
    public void residents() {
        System.out.println(this.residents);

    }
}
