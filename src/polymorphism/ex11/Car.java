package polymorphism.ex11;

public class Car extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car is stopped...");
    }
}
