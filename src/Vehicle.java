package src;

public abstract class Vehicle {
    int speed;
    float weight;


    public Vehicle(int speed, float weight) {
        this.speed = speed;
        this.weight = weight;
    }


    void startEngine() {
        System.out.println("Vroom!");
    }
    void turnOffEngine() {
        System.out.println("No more vroom..");
    }
}
