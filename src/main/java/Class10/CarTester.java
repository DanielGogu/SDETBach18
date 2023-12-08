package Class10;

public class CarTester {
    public static void main(String[] args) {
        //Create an object from the class
        Car car1=new Car();
        car1.model="I7";
        car1.color="Blue";
        car1.make="BMW";
        car1.price=120000;
        car1.drive();
        car1.ApplyBreakes();
        car1.honk();
    }
}
