package src;

public class Main {

    public static void main(String[] args) {
        Car seat = new Car(130, 550);
        FlyingCar superSeat = new FlyingCar(350, 550);
        Plane boeing = new Plane(500, 750);

        seat.startEngine();
        seat.turnOffEngine();

        superSeat.accelarate();
        superSeat.changeHeight();

        boeing.land();
        boeing.takeOff();
    }
}
