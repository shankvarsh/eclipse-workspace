//3. Write a Java program to perform the following:
  //   i)Create a LinkedList collection containing the following string objects(colors):
    //   red , blue, green, yellow, black.
    //ii)Using a ListIterator, scan the above list in the reverse order(ie. from last to
      // first) and remove all elements(colors) that have a string length of less than 5.


package assignment3;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        // Step 1: Create a LinkedList and add colors to it
        LinkedList<String> colorsList = new LinkedList<>();
        colorsList.add("red");
        colorsList.add("blue");
        colorsList.add("green");
        colorsList.add("yellow");
        colorsList.add("black");

        // Step 2: Using a ListIterator, scan the list in reverse order and remove elements with length less than 5
        ListIterator<String> listIterator = colorsList.listIterator(colorsList.size());
        while (listIterator.hasPrevious()) {
            String color = listIterator.previous();
            if (color.length() < 5) {
                listIterator.remove();
            }
        }

        // Step 3: Print the updated LinkedList
        System.out.println("Updated LinkedList:");
        for (String color : colorsList) {
            System.out.println(color);
        }
    }
}

