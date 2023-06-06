package AssesmentQuestionsDiatoz;

class AirVechicle{
    public void startEngine(){
        System.out.println("Engine Started flying started"); // 1
        stopEngine();
    }
    public void stopEngine(){
        System.out.println("Engine stopped, air vechicle in landing phase"); //2
    }
}
class Aeroplane extends AirVechicle{
    public void startEngine(){
        super.startEngine();
        System.out.println("Aeroplane engine started, aeroplane flying"); //3
    }
    public void stopEngine(){
        System.out.println("Aeroplane engine stopped, aeroplane in landing phase"); //4
    }
}
public class test9 {
    public static void main(String[] args) {
        new Aeroplane().startEngine();
    }
}
