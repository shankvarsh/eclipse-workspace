//1.Write a Java program to perform the following:
//    i)Create a LinkedList collection containing the following string objects(colors):
  //     red , blue, green, yellow, black.
   //ii)Using an iterator, scan the above list and remove all elements(colors) that have
     //  a string length of less than 5.

package assignment3;
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        // Step 1: Create a LinkedList and add colors to it
        LinkedList<String> colorsList = new LinkedList<>();
        colorsList.add("red");
        colorsList.add("blue");
        colorsList.add("green");
        colorsList.add("yellow");
        colorsList.add("black");

        System.out.println("LinkedList:");
        for (String colorss : colorsList) {
            System.out.println(colorss);
        }
        // Step 2: Using an iterator, remove elements with a string length less than 5
        Iterator<String> iterator = colorsList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() < 5) {
                iterator.remove();
            }
        }

        // Step 3: Print the updated LinkedList
        System.out.println("Updated LinkedList:");
        for (String color : colorsList) {
            System.out.println(color);
        }
    }
}


