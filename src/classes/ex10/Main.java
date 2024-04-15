package classes.ex10;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Michael", 6);
        Student student2 = new Student("Ann", 4);
        Student student3 = new Student("Rafael", 2);

        System.out.println("Students detail:");
        student1.printStudentDetail();
        student2.printStudentDetail();
        student3.printStudentDetail();

        System.out.println("Adding courses for " + student1.getName());
        student1.addCourse("Math");
        student1.addCourse("Science");
        student1.addCourse("English");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());

        System.out.println("\nAdding courses for " + student2.getName());
        student2.addCourse("History");
        student2.addCourse("Geography");
        student2.addCourse("English");
        System.out.println(student2.getName() + "'s courses: " + student2.getCourses());
        System.out.println("\nRemoving 'Science' course for " + student1.getName());
        student1.removeCourse("Science");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());

    }
}
