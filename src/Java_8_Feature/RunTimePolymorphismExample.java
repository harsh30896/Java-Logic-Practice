package Java_8_Feature;

public class RunTimePolymorphismExample
{
    // polymorphism means many forms
    // Ability of an object to behave differently
    // two types of polymorphism

    // compile time polymorphism(static binding,early binding)
    //-> objects are bound with their functionality at compile-time
    // -> this can be achieve through overloading

    // run time polymorphism(dynamic binding, late binding)
    //-> objects are bound with their functionality at the run-time
    // -> this can be achieve through overriding

    public static void main(String[] args)
    {
        // compile time polymorphism
//        OverLoadingClassExample ovr = new OverLoadingClassExample();
//        ovr.read();
//        ovr.read("The complete REfrence");


        // calling the parent or child method decision taken at run time
        // this is called run time polymorphism
        OverRidingClassExample overRidingClassExample = new OverRidingNew();
        overRidingClassExample.showDetail();

    }

}
