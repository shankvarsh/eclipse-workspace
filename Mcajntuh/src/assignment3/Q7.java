//7.    Write a Java program to perform the following:
  //       i)Create a TreeSet collection containing the following string objects(colors):
    //        red , blue, green, yellow, black.
      //  ii)Use an appropriate iterator, traverse the above TreeSet and display the
        //    contents.


package assignment3;
import java.util.*;



public class Q7 {
    public static void main(String[] args) {
        TreeSet<String> colorsTreeSet = new TreeSet<>();
        colorsTreeSet.add("red");
        colorsTreeSet.add("blue");
        colorsTreeSet.add("green");
        colorsTreeSet.add("yellow");
        colorsTreeSet.add("black");

        System.out.println("Contents of the TreeSet:");
        Iterator<String> iterator = colorsTreeSet.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }
    }
}


