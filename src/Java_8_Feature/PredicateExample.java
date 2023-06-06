package Java_8_Feature;

import java.util.function.Consumer;
import java.util.function.Predicate;

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class PredicateExample {
    public static void main(String[] args) {
         Predicate<String> checkLength = str -> str.length() > 5;
         //checking the length of string > 5 -- true--else--false
         System.out.println(checkLength.test("checkLength"));

        // Consumer Example
        Person p = new Person();
        Consumer<Person> setName = t -> t.setName("Play java");
        setName.accept(p);
        System.out.println(p.getName());
    }
}
