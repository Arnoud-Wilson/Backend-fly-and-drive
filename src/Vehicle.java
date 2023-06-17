package src;

public abstract class Vehicle {
    int speed;
    float weight;


    public Vehicle(int speed, float weight) {
        this.speed = speed;
        this.weight = weight;
    }


    abstract void startEngine();
    abstract void turnOffEngine();
}
