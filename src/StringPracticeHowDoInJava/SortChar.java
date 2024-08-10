package StringPracticeHowDoInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortChar {
    public static void main(String[] args) {
        String string = "adcbgekhs";
//        String sortedChar = Stream.of(string.split(""))
//                .sorted()
//                .collect(Collectors.joining());
//        System.out.println(sortedChar);
//        char[] chars = string.toCharArray();
//        Arrays.sort(chars);
//        System.out.println(chars);


        String blogName = "how, to, do, in, java";
        String[] tokenArray = blogName.split("\\s*,\\s*");
        ArrayList<String> tokenArrayList = new ArrayList(Arrays.asList(tokenArray));
    }
}
