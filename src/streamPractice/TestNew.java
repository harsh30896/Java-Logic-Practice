package streamPractice;

import java.util.Arrays;

public class TestNew {
    public static void main(String[] args) {

        String[] arr = new String[]{"abc", "ecd", "ccd", "cab", "man"};

        Arrays.stream(arr)
                .filter(x -> x.startsWith("c"))
                .forEach(System.out::println);
    }
}




