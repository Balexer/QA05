package homework_6.task_2;

public class Car {
    private Engine engine;
    private Transmission transmission;
    private int speed;

    public Car(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    public void shiftUp() {
        transmission.transmissionUp();
    }

    public void shiftDown() {
        transmission.transmissionDown();
    }

    public void engineOn() {
        if (engine.getIsOn() == true) { // if (engine.getIsOn()) {
            System.out.println("Двигатель уже работает");
        } else {
            System.out.println("Двигател заведен");
            engine.engineOn();
        }
    }

    public void engineOff() {
        if (engine.getIsOn() == false) { // if (engine.getIsOn()) 
            System.out.println("Двигатель уже выключен");
        } else {
            System.out.println("Двигател заглушен");
            engine.engineOff();
        }
    }

    public int speed() {
        if (engine.getIsOn()) {
            return transmission.getTransmission() * 20;
        } else {
            return transmission.getTransmission() * 0;
        }
    }

}
