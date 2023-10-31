//5.   Write a Java program to perform the following:
  //     i)Create a LinkedList collection containing the following string objects(colors):
    //      red , blue, green, yellow, black.
      //ii)Sort the colors in ascending order and then search for a color(key) in the
        // sorted list of colors using binary search. Display appropriate message.
package assignment3;
import java.util.*;

public class Q5 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        // Step 1: Create a LinkedList and add colors to it
        LinkedList<String> colorsList = new LinkedList<>();
        colorsList.add("red");
        colorsList.add("blue");
        colorsList.add("green");
        colorsList.add("yellow");
        colorsList.add("black");

        // Step 2: Sort the colors in ascending order
        Collections.sort(colorsList);
        System.out.println("After sorting");
for(String colors: colorsList)
{
	System.out.println(colors);
}
        // Step 3: Search for a color (key) using binary search
        System.out.println("Enter color to search");
        String ss=sc.next();
        String searchColor = ss;
        int index = Collections.binarySearch(colorsList, searchColor);

        // Step 4: Display appropriate message based on the search result
        if (index >= 0) {
            System.out.println("Color '" + searchColor + "' found at index " + index);
        } else {
            System.out.println("Color '" + searchColor + "' not found in the list.");
        }
    }
}

