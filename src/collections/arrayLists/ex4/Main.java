package collections.arrayLists.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Write a Java program to retrieve an element (at a specified index) from a given array list.
 */
public class Main {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();

        cityList.add("Warsaw");
        cityList.add("Prague");
        cityList.add("Krakowia");
        cityList.add("Los Angeles");

        Random random = new Random();
        int randInt = random.nextInt(4);

        System.out.println("item on index: " + randInt + " is: " + cityList.get(randInt));


    }
}
