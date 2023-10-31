package sem2;
import java.util.Arrays;

public class BubBinName {
    public static void main(String[] args) {
        String[] names = {"Kai", "Cherry","Chay","Chaya","Angel","Angela", "Pinky", "Isabella", "Panda"};
        String key = "Pinky";
        System.out.println("Unsorted names: " + Arrays.toString(names));

        // Sort the names in ascending order
        bubbleSort(names);

        // Print the sorted names
        System.out.println("Sorted names: " + Arrays.toString(names));

        // Search for the key using binary search
        int index = binarySearch(names, key);

        // Display the search result
        if (index != -1) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }
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

    // Function to perform binary search on a sorted array of strings
    public static int binarySearch(String[] arr, String key) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = left + (right-left) / 2;

            if (arr[mid].equals(key)) {
                return mid; // Key found
            } else if (arr[mid].compareTo(key) < 0) {
                left = mid + 1; // Key may be in the right half
            } else {
                right = mid - 1; // Key may be in the left half
            }
        }

        return -1; // Key not found
    }
}
