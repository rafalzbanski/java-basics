package collections.arrayLists.ex3;

import java.util.ArrayList;
import java.util.List;

/*
. Write a Java program to insert an element into the array list at the first position.
 */
public class Main {
    public static void main(String[] args) {

        // create list for queue
        List<String> queue = new ArrayList<>();

        // add some items
        queue.add("rafal");
        queue.add("alexander");
        queue.add("ohmer");
        queue.add("pawel");

        System.out.println("Original list: " + queue);

        // add item on first index
        queue.add(0, "King");

        System.out.println("After update: " + queue);



    }
}
