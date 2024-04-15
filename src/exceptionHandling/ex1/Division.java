package exceptionHandling.ex1;

public class Division {
    public static void main(String[] args) {
        System.out.println("----- Division -------");
        System.out.println("0 / 2 = " + (0/2));
        try {
            System.out.println("2 / 0 = " + (2/0));
        }catch (ArithmeticException e){
            System.out.println("You can not divide by 0!");
        }catch (Exception e){
            System.out.println("Something went wrong :(");
        }

    }
}
