package collections.arrayLists.ex1;

import java.util.ArrayList;

/*
1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
 */
public class Main {
    public static void main(String[] args) {

        // create array list for storing colors
        ArrayList<String> colors = new ArrayList<String>();

        // add colors
        colors.add("blue");
        colors.add("yellow");
        colors.add("pink");
        colors.add("green");

        // print list

        System.out.println("list item:");
        for (String color: colors) {
            System.out.println(color);
        }
    }
}
