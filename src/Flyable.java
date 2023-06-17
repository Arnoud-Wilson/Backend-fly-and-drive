package src;

public interface Flyable {
    default void takeOff() {
        System.out.println("Default Go!");
    }

    default void land() {
        System.out.println("Default land");
    }

    default void changeHeight() {
        System.out.println("Default change height");
    }
}
