package StringPracticeHowDoInJava;

public class ReverseStringRecursion {
    public static void main(String[] args) {
        String str = "hello";
        String reversedString = reverseStringMethod(str, str.length() - 1);
        System.out.println(reversedString);
    }

    private static String reverseStringMethod(String str, int len) {
        // Base case: if len is less than 0, return an empty string
        if (len < 0) {
            return "";
        }

        // Step 1: Get the current character
        char currentChar = str.charAt(len);

        // Step 2: Recursively call the function for the remaining part of the string
        String reversedRemaining = reverseStringMethod(str, len - 1);

        // Step 3: Concatenate the current character with the reversed remaining string
        String result = currentChar + reversedRemaining;

        // Step 4: Return the result
        return result;
    }
}
