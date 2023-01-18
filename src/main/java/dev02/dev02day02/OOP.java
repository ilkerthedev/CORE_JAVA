package dev02.dev02day02;

public class OOP extends GrandOOP {

    String oop = "oop";

    public OOP() {
        super();
        System.out.println("oop");
    }

    public OOP(String oop) {
        super("grand");
        this.oop = oop;
        System.out.println(oop);
    }

    public void oop(){
        System.out.println("oop");
    }


}
