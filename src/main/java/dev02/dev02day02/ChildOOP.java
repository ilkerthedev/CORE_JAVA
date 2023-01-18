package dev02.dev02day02;

public class ChildOOP extends OOP {

    String childOOP = "childOOP variable";

    public void childMethod(){
        System.out.println("childMethod test");
    }

    public ChildOOP(String childOOP) {
        super();
        this.childOOP = childOOP;
        System.out.println(childOOP);
    }

    public ChildOOP() {
        super();
        System.out.println("childOOP");
    }



}
