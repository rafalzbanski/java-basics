package polymorphism.ex11;

public class Motorcycle extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle is stopped...");
    }
}
