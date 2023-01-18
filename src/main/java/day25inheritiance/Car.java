package day25inheritiance;

public class Car extends Vehicle {

    public int price = 11000 ;

    public void engine(){
        System.out.println("Car engine..");
    }

    public Car() {
        System.out.println("Car 1");
    }

    public Car(String make){
        System.out.println("Car 2: "+make);
    }

}
