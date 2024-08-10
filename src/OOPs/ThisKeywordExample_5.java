package OOPs;

// use of this keyword for constructor chaining

class NewStudent{
    int rollno;
    String name,course;
    int fee;
    NewStudent(int rollno, String name, String course){
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }
    NewStudent(int rollno,String course,String name,int fee){
        this(rollno,name,course);
        this.fee = fee;
    }
    void display(){
        System.out.println(rollno+" "+name
        +" "+course+" "+fee);
    }
}

public class ThisKeywordExample_5 {

    public static void main(String[] args) {
        NewStudent newStudent = new NewStudent(111,"abc","java",600);
        NewStudent newStudent1 = new NewStudent(112,"xyz","python",6000);
        newStudent.display();
        newStudent1.display();
    }

}
