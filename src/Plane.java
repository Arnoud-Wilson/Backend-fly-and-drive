package src;

public class Plane extends Vehicle implements Flyable {

    public Plane(int speed, float weight) {
        super(speed, weight);
    }


    @Override
    public void takeOff() {
        System.out.println("Go!");
    }

    @Override
    public void land() {
        System.out.println("Down to earth");
    }

    @Override
    public void changeHeight() {
        System.out.println("Change height");
    }
}
