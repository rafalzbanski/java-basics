package polymorphism.ex12;

public class Cylider extends Circle{
    private final double height;

    public Cylider(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing the Cylinder");
    }

    @Override
    public double calculateArea() {
       double circleArea = super.calculateArea();
       double sideArea = 2 * Math.PI * getRadius() * height;
       return  2 * circleArea + sideArea;
    }
}
