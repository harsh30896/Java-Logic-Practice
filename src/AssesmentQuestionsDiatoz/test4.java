package AssesmentQuestionsDiatoz;

public class test4 {
    public static void main(String[] args)
    {
        Producable producable = new VechicleProducer();
        Producable.produce();
        producable.produce(0);
        Producable.produce(0,0);
        Producable.produce();
        VechicleProducer.produce();
        Producable.produce(0,0);

    }
}
    interface Producable{
        static void produce(){
            System.out.println("I am not producing, maybe this is wrong for my interface");
        }
        static void produce(int overload, int extraOverloaded){
            System.out.println("I am not producing even overloaded, maybe this is wrong for my interface");
        }
        Vechicle produce(int overloaded);
    }
    class Vechicle{
        public void produceDefault(){

        }
    }
    class VechicleProducer implements Producable{

    static void produce(){
        System.out.println("Producing");
    }
    static  void produce(int overloaded, int extraOverloaded){
            System.out.println("Cosuming and then producing");
        }

        public Vechicle produce(int overloaded){
            return new Vechicle();
        }

    }

