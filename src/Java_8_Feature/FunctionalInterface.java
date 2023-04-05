package Java_8_Feature;

import java.util.function.Function;
// functional Interface, function example
public class FunctionalInterface {
    public static void main(String[] args) {
        Function<Integer, String> getInt = t -> t * 10 + " data multiplied by 10";
        System.out.println(getInt.apply(2));
    }
}
