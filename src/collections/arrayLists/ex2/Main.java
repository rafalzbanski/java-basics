package collections.arrayLists.ex2;

import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to iterate through all elements in an array list.
 */
public class Main {
    public static void main(String[] args) {

        // create list for names
        List<String> names = new ArrayList<String>();

        // add names
        names.add("rafal");
        names.add("alexander");
        names.add("rayan");
        names.add("pawel");

        // iterate through
        for (String name :names) {
            System.out.println(name);
        }

    }
}
