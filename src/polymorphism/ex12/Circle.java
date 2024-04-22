package polymorphism.ex12;

public class Circle extends Shape{

    private final double radius;
    private static final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * PI;
    }

    protected double getRadius() {
        return radius;
    }


}
