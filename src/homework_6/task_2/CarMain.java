package homework_6.task_2;

public class CarMain {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Transmission transmission = new Transmission();

        Car car = new Car(engine, transmission);
        car.engineOn();
        car.engineOn();
        car.shiftUp(); // а что если написать метод в этом классе, который бы принимал car и вызывал повысить передачу в цикле нужное кол-во раз
        car.shiftUp();
        car.shiftUp();
        car.shiftUp();
        car.shiftUp();
        car.shiftUp();
        car.shiftUp();
        car.shiftUp();
        car.shiftUp();
        car.shiftDown();
        System.out.println("Скорость машины = " + car.speed());
        car.engineOff();
        car.shiftUp();
        car.shiftUp();
        System.out.println("Скорость машины = " + car.speed());
        car.engineOff();
//все это - проверки всех функций машины

    }
}
