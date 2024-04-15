package classes.ex9;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private int salary;
    private LocalDate hireDate;

    public Employee(String name, int salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDateDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getYearsOfService(){
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public void printEmployeeDetails(){
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
        System.out.println("hire date: " + hireDate);
    }
}
