package OOPs;

public class ConstructorChainingExample {
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

    ConstructorChainingExample(String name, String age,String company){
        this.name= name;
        this.age = age;
        this.company = company;
    }
    ConstructorChainingExample(String name, String age){
        this(name,age,"google");

    }
    ConstructorChainingExample(String name){
        this(name,"29","goldman");

    }

    public static void main(String[] args) {
        ConstructorChainingExample obj1 = new ConstructorChainingExample("Harsh", "30", "Microsoft");
        ConstructorChainingExample obj2 = new ConstructorChainingExample("Harsh", "30");
        ConstructorChainingExample obj3 = new ConstructorChainingExample("Harsh");

        System.out.println("obj1: " + obj1.getName() + ", " + obj1.getAge() + ", " + obj1.getCompany());
        System.out.println("obj2: " + obj2.getName() + ", " + obj2.getAge() + ", " + obj2.getCompany());
        System.out.println("obj3: " + obj3.getName() + ", " + obj3.getAge() + ", " + obj3.getCompany());
    }

}
