//Write a Java program to perform the following:
//   i)Create an ArrayList collection containing the following string objects(colors):
//    red , blue, green, yellow, black.
//   ii)Use foreach statement that scans the above list and outputs the
//    elements(colors).
//   iii)Using an appropriate iterator, replace the string, “yellow” with string “purple”
//    in the above list.

package assignment3;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList and add colors to it
        ArrayList<String> colorsList = new ArrayList<>();
        colorsList.add("red");
        colorsList.add("blue");
        colorsList.add("green");
        colorsList.add("yellow");
        colorsList.add("black");

        // Step 2: Use foreach statement to output the elements
        System.out.println("Colors in the ArrayList:");
        for (String color : colorsList) {
            System.out.println(color);
        }

        // Step 3: Using an iterator, replace "yellow" with "purple"
        Iterator<String> iterator = colorsList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("yellow")) {
            	colorsList.set(colorsList.indexOf("yellow"),"purple");
            }
        }

        // Step 4: Print the updated ArrayList
        System.out.println("\nUpdated Colors in the ArrayList:");
        for (String color : colorsList) {
            System.out.println(color);
        }
    }
}

