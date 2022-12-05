public class OOPS {
    public static void main(String[] args) {
        System.out.println("hello world !!");
        Car c1 = new Car();
        System.out.println(c1);
        c1.brand="Audi";
        c1.model_number=12;
        c1.varient="petrol";
        System.out.println(c1.brand);
        Car c2 = new Car();
        Car c3 = new Car();
        Car c4 = new Car();
        System.out.println(Car.count);
        c1.run(" BMW");
    }
}
class Car{
    String brand;
    int model_number;
    String varient;
    static int count;
    public Car(){
        count++;
    }
    public static void run(String name){
        System.out.println(name+" car is running");
    }

}
