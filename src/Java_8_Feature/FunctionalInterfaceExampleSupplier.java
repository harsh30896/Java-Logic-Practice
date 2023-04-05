package Java_8_Feature;

import java.util.function.Supplier;

public class FunctionalInterfaceExampleSupplier {

    // functional Interface, supplier example

    public static void main(String[] args) {
        Supplier<Double> getRandomDouble = () -> Math.random();
        System.out.println(getRandomDouble.get());
    }
}
