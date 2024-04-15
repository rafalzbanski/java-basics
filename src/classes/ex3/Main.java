package classes.ex3;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2., 5.);

        System.out.println("Rectangle with width: " + rectangle.getWidth() + " and height: " + rectangle.getHeight());
        System.out.println("---> Area is: " + rectangle.area());
        System.out.println("---> Perimeter is: " + rectangle.perimeter());

        rectangle.setHeight(9.);
        rectangle.setWidth(21.);

        System.out.println("-------------- After change --------------");

        System.out.println("Rectangle with width: " + rectangle.getWidth() + " and height: " + rectangle.getHeight());
        System.out.println("---> Area is: " + rectangle.area());
        System.out.println("---> Perimeter is: " + rectangle.perimeter());
    }
}
