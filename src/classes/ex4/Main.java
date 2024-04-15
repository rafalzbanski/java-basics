package classes.ex4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12.);

        System.out.println("Circle with radius: " + circle.getRadius());
        System.out.println("---> Has area: " + circle.area());
        System.out.println("---> Has circumference: " + circle.circumference());

        circle.setRadius(6.);

        System.out.println("\n------- After change ---------\n");

        System.out.println("Circle with radius: " + circle.getRadius());
        System.out.println("---> Has area: " + circle.area());
        System.out.println("---> Has circumference: " + circle.circumference());

        System.out.println("\nFor the calculations, the PI number was taken as " + circle.getPI());

    }
}
