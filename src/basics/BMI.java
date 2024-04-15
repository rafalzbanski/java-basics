package basics;

public class BMI {
    static String bmi(double weight, double height){
        double calculation = height / (weight * weight);
        return "Body mass Index is " + calculation;
    }
    public static void main(String[] args) {
        /*
        Write a Java program to compute the body mass index (basics.BMI).

        Test Data
        Input weight in pounds: 452
        Input height in inches: 72
        Expected Output:
        Body Mass Index is 61.30159143458721
         */
        System.out.println(bmi(452,72));
    }
}
