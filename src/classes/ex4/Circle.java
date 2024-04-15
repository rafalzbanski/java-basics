package classes.ex4;

public class Circle {
    private final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return this.PI * this.radius * this.radius;
    }

    public double circumference(){
        return 2 * this.PI * this.radius;
    }
}
