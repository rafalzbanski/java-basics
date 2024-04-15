package conditionals;

public class PositiveNegative {
    static String check(int age){
        if (age >= 0 ){
            return "Positive";
        }else {
            return "Negative";
        }
    }
    public static void main(String[] args) {
        /*
        Write a Java program to get a number from the user
        and print whether it is positive or negative.

        Test Data
        Input number: 35
        Expected Output :
        Number is positive
         */
        System.out.println(check(90));
    }
}
