package StringPracticeHowDoInJava;

import java.util.HashMap;

public class DuplicateString {

    public static void main(String[] args) {
        String str = "hello world hello java hello python hi world";
        revString(str);
    }

    public static void revString(String str) {
        String[] arr = new String[10];
        int count = 0; // Change to track the current position in arr
        String[] words = str.split(" ");
        boolean[] visited = new boolean[words.length]; // Track visited words

        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue; // Skip this word if it has been counted already
            }
            int countString = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    countString++;
                    visited[j] = true; // Mark this word as visited
                }
            }
            arr[count] = words[i] + " " + countString;
            count++;
        }

        for (int i = 0; i < count; i++) { // Print only the filled part of the array
            System.out.println(arr[i]);
        }
    }
}
