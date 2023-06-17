package src;

public class Car extends Vehicle implements Driveable{

    public Car(int speed, float weight) {
        super(speed, weight);
    }

    @Override
    void startEngine() {
        System.out.println("Vroom!");
    }

    @Override
    void turnOffEngine() {
        System.out.println("No more vroom..");
    }

    @Override
    public void accelarate() {
        System.out.println("Lets go!");
    }

    @Override
    public void brake() {
        System.out.println("Stop");
    }

    @Override
    public void changeGear() {
        System.out.println("Change gear");
    }
}
