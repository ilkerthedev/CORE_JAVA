package day25inheritiance;

public class Honda extends Car {

    public int price = 10000;

    public void engine(){
        System.out.println("Honda engine..");
    }

    public Honda() {
        System.out.println("Honda 1");

    }

    public Honda(String model,int year){
        System.out.println("Honda 2: "+model+" - "+year);
    }

}
