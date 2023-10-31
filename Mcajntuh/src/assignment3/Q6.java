//6.    Write a Java program that counts the occurrences of words in a text and
  //     displays the words and their occurrences in alphabetical order of words.
    //   Hint:Use a TreeMap to store an entry consisting of a word and its count.

package assignment3;
import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        String text = "This is a simple text. The text contains some words that repeat. " +
                      "The words will be counted to find their occurrences.";

        // Step 1: Remove punctuation and convert text to lowercase
        String cleanedText = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Step 2: Split the cleaned text into individual words
        String[] words = cleanedText.split("\\s+");

        // Step 3: Count occurrences of words using a TreeMap
        TreeMap<String, Integer> wordOccurrences = new TreeMap<>();
        for (String word : words) {
            wordOccurrences.put(word, wordOccurrences.getOrDefault(word, 0) + 1);
        }

        // Step 4: Display words and their occurrences in alphabetical order
        System.out.println("Word Occurrences (Alphabetical Order):");
        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            String word = entry.getKey();
            int occurrences = entry.getValue();
            System.out.println(word + ": " + occurrences);
        }
    }
}


