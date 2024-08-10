package OOPs;

// In this code "this" refer current class instance variable

class Student{
    int roll;
    String name;
    int fee;

    Student(int roll, String name, int fee){
        this.roll = roll;
        this.name = name;
        this.fee = fee;
    }
    void display(){
        System.out.println(roll+" "+name+" "+fee);
    }
}
public class ThisKeywordExample_1 {

    public static void main(String[] args) {

        Student s1 = new Student(111,"abc",200);
        s1.display();
    }
}
