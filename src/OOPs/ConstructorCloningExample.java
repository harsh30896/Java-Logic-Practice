package OOPs;

public class ConstructorCloningExample {
    private String name;
    private String age;
    private String company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    ConstructorCloningExample(String name,String age,String company){
        this.name = name;
        this.age = age;
        this.company = company;
    }
    ConstructorCloningExample(ConstructorCloningExample constructorCloningExample){
        this.name = constructorCloningExample.name;
        this.age = constructorCloningExample.age;
        this.company = constructorCloningExample.company;
    }

    public static void main(String[] args) {
        ConstructorCloningExample obj = new ConstructorCloningExample("Harsh","30","Microsoft");
        ConstructorCloningExample copy = new ConstructorCloningExample(obj);

        System.out.println(obj.hashCode());
        System.out.println(copy.hashCode());
    }
}
