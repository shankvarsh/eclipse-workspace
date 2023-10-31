package sem2;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();

        String[] names = new String[numNames];

        // Input names from the user
        for (int i = 0; i < numNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.next();
        }

        // Sort the names in ascending order using bubble sort
        bubbleSort(names);

        // Print the sorted names
        System.out.println("Sorted names: ");
        for (int i=0;i<names.length;i++) {
            System.out.println(names[i]+"  ");
        }

        scanner.close();
    }

    // Function to perform bubble sort on an array of strings
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j+1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

