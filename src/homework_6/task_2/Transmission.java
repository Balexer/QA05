package homework_6.task_2;

public class Transmission {
    int transmission;
    int speed;

    public Transmission() {
        this.transmission=0;
    }
    public void transmissionUp() {
        if(transmission<=7) {
            transmission++;
        }
    }
    public void transmissionDown() {
        if(transmission>0) {
            transmission--;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getTransmission() {
        return transmission;
    }

    public void setTransmission(int transmission) {
        this.transmission = transmission;
    }
}
