package encapsulation.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to create a class called Person with private instance variables name, age. and country.
 * Provide public getter and setter methods to access and modify these variables.
 */
public class Person {
    private String name;
    private int age;
    private String country;

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static void main(String[] args) {

        // list for storing data
        List<Person> personList = new ArrayList<>();

        // create a couple of Person objects
        Person person1 = new Person("Anna", 25, "Poland");
        Person person2 = new Person("Mark", 78, "Germany");
        Person person3 = new Person("Jacob", 56, "France");

        // adding persons to list
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println("------  List of Persons  -------");
        for (Person person : personList) {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Country: " + person.getCountry());
            System.out.println("------------------");
        }

        System.out.println("Updating data...");
        person1.setName("Amadeus");
        person2.setAge(100);
        person3.setCountry("Australia");

        System.out.println("------  List of Persons after update -------");
        for (Person person : personList) {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Country: " + person.getCountry());
            System.out.println("------------------");
        }



    }
}
