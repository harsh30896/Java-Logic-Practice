package streamPractice;

import java.util.*;
import java.util.stream.Collectors;

// calculate the integer average using stream
//Convert List of Strings to Uppercase or Lowercase using Streams
//Sum of Even and Odd Numbers in a List using Streams
// Remove the duplicates in the array
//Count Strings Starting with Specific Letter using Streams
//Sort List of Strings in Ascending and Descending Order using Streams
//Find Maximum and Minimum Values in a List of Integers using Streams
public class StreamPractice_1 {
    public static void main(String[] args) {


//        List <Integer> nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
//        Double sum = nums.stream()
//                .mapToDouble(Integer::doubleValue)
//                .average()
//                .orElse(0.0);

        List <String> colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
        List<String> upperCase = colors.stream().map(x->x.toUpperCase())
                .collect(Collectors.toList());
        for(String color:upperCase){
            System.out.println(color);
        }

//        List < Integer > numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> arms = numbers.stream().filter(x->x%2!=0)
//                .collect(Collectors.toList());
//
//        arms.forEach(System.out::println);

//        List <Integer> nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15,22,15,10);
//        List <Integer> filtered = nums.stream().distinct().collect(Collectors.toList());
//        filtered.forEach(System.out::println);

    //    List <String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
//        List<String> sortedString = colors.stream().sorted().collect(Collectors.toList());
//        for(String sortedS:sortedString){
//            System.out.println(sortedS);
//        }

//        List<String> sortedString = colors.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
 //       sortedString.forEach(System.out::println);


//        List <Integer> nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
//            List<Integer> maxLIst=nums.stream().max(Comparator.naturalOrder()).stream().collect(Collectors.toList());
//            maxLIst.forEach(System.out::println);
//        List<Integer> minLIst=nums.stream().min(Comparator.naturalOrder()).stream().collect(Collectors.toList());
//            minLIst.forEach(System.out::println);

        List < Integer > numbers = Arrays.asList(9, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List < Integer > dup = numbers.stream().filter(i -> Collections.frequency(numbers,i)>1).collect(Collectors.toList());
        dup.forEach(System.out::println);
    }
}
