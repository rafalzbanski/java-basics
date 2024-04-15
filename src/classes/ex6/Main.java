package classes.ex6;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Employee -----------");
        Employee emp1 = new Employee("James", "IT", 3500.00);

        System.out.println("--- name: " + emp1.getName());
        System.out.println("--- working as: " + emp1.getJobTitle());
        System.out.println("--- with salary: " + emp1.getSalary());
        System.out.println("--- yearly salary is: " + emp1.yearlySalary());

        System.out.println("\n---------- After the raise -------------");

        emp1.setSalary(12000.98);
        System.out.println("--- update salary: " + emp1.getSalary());
        System.out.println("--- update yearly salary is: " + emp1.yearlySalary());

    }
}
