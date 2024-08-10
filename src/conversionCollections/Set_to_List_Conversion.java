package conversionCollections;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

/*
Using Set Traversing
Using ArrayList or LinkedList Constructor
Using addAll() method
Using Stream in Java
Using List.copyOf() in java
*/
public class Set_to_List_Conversion {
    public static void main(String[] args) {
        Set<String> setString = new HashSet<>();


        setString.add("nokia");
        setString.add("samsung");
        setString.add("xiaomi");
        setString.add("iphone");
        setString.add("oneplus");

        //Using Set Traversing
//        for (String s:setString){
//            setArray.add(s);
//        }

        //Using ArrayList or LinkedList Constructor
//        List<String> setArray = new ArrayList<String>(setString);
//        setArray.forEach(System.out::println);

      //  Using addAll() method
//        List<String> setArray = new ArrayList<String>();
//        setArray.addAll(setString);
//        setArray.forEach(System.out::println);



        //Using Stream in Java
//        List<String> setArray = setString.stream().toList();
//        setArray.forEach(System.out::println);

        // Using List.copyOf() in java
//         List<String> setArray = new ArrayList<>();
//         setArray = List.copyOf(setString);
//         setArray.forEach(System.out::println);


        int num[] = {1,2,3,4,5,6,7};
        int key = 3;  // key to be searched


        boolean result = IntStream.of(num).anyMatch(x->x==key);
        if(result == true){
            System.out.println("present number");
        }else{
            System.out.println("Not present number");
        }


    }
}
