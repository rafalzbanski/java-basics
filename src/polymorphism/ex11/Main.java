package polymorphism.ex11;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        startAndStopEngine(car);

        Vehicle motorcycle = new Motorcycle();
        startAndStopEngine(motorcycle);
    }
    public static void startAndStopEngine(Vehicle vehicle) {
        vehicle.startEngine();
        vehicle.stopEngine();
    }
}
