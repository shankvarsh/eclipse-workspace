//4.  Write a Java program to perform the following:
  //    i)Create a HashMap that contains 4 mappings of student names and their end
    //    marks in a subject.
     //ii)Obtain a set view of the mappings. Then traverse the set using an iterator and
       // display the contents of the map.


package assignment3;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        // Step 1: Create a HashMap and add mappings of student names and their end marks
        HashMap<String, Integer> studentMarksMap = new HashMap<>();
        studentMarksMap.put("Alice", 90);
        studentMarksMap.put("Bob", 85);
        studentMarksMap.put("Charlie", 95);
        studentMarksMap.put("Diana", 88);

        // Step 2: Obtain a set view of the mappings
        Set<Map.Entry<String, Integer>> entrySet = studentMarksMap.entrySet();

        // Step 3: Traverse the set using an iterator and display the contents of the map
        System.out.println("Student Marks:");
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String studentName = entry.getKey();
            int marks = entry.getValue();
            System.out.println(studentName + ": " + marks);
        }
    }
}

