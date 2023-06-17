package src;

public class FlyingCar extends Vehicle implements Driveable, Flyable {

    public FlyingCar(int speed, float weight) {
        super(speed, weight);
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
