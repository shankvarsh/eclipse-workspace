//          8.  Write a Java program to perform the following:
  //       i)Create a PriorityQueue collection and add the following string
    //        objects(colors) in the order given:
      //           red , blue, green, yellow, black.
        //ii)Use an appropriate iterator, traverse the above PriorityQueue and display
          //  the contents.
       // iii)Remove the elements(string objects(colors)) from the above PriorityQueue
         //   and display them.

package assignment3;
import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        // Step 1: Create a PriorityQueue and add colors to it
        PriorityQueue<String> colorsPriorityQueue = new PriorityQueue<>();
        colorsPriorityQueue.add("red");
        colorsPriorityQueue.add("blue");
        colorsPriorityQueue.add("green");
        colorsPriorityQueue.add("yellow");
        colorsPriorityQueue.add("black");

        // Step 2: Use an iterator to traverse the PriorityQueue and display the contents
        System.out.println("Colors in the PriorityQueue:");
        Iterator<String> iterator = colorsPriorityQueue.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }

        // Step 3: Remove elements from the PriorityQueue and display them
        System.out.println("\nRemoved Colors from the PriorityQueue:");
        while (!colorsPriorityQueue.isEmpty()) {
            String removedColor = colorsPriorityQueue.poll();
            System.out.println(removedColor);
        }
    }
}

