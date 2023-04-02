package Java_8_Feature;

public class OverRidingClassExample
{
        public void showDetail()
        {
            System.out.println("Basic dettails of person");
        }

}
class OverRidingNew extends OverRidingClassExample
{
    public void showDetail()
    {
        System.out.println("This is overridden class method");
    }
}