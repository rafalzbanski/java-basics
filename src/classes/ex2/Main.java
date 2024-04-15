package classes.ex2;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", "Golden Retriever");
        Dog dog2 = new Dog("Loli", "York");

        System.out.println("First dog called: " + dog1.getName() + " with breed: " + dog1.getBreed());
        System.out.println("Second dog called: " + dog2.getName() + " with breed: " + dog2.getBreed());

        dog1.setName("Mandarin");
        dog2.setName("Bananas");

        System.out.println("------------   After name change   --------------");

        System.out.println("First dog called: " + dog1.getName() + " with breed: " + dog1.getBreed());
        System.out.println("Second dog called: " + dog2.getName() + " with breed: " + dog2.getBreed());

    }
}
