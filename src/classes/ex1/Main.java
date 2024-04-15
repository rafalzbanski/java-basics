package classes.ex1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Rafal", 22);
        Person person2 = new Person("Mela", 23);

        System.out.println("Person with name " + person1.getName()+ " is " + person1.getAge() + " years old.");
        System.out.println("Person with name " + person2.getName() + " is " + person2.getAge() + " years old.");

    }
}
