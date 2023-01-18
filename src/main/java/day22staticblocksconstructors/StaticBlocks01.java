package day22staticblocksconstructors;

public class StaticBlocks01 {

    //Bir variable olusturdugunuzda, deger atamazsaniz o variable'i "initialize" etmediniz demektir.
    //static variable'lar static block'lar icinde initialize edilirse o class'in icinde her seyden once hazir hale getirilmis olur.
    //Bazen main method calistirilmadan once variable'larin hazir hale getirilmesi gerekir bu yuzden static block'lar kullanilir.

    //Note 1: "static block" lar static variable'lari initialize etmek icin kullanilirlar.
    //Note 2: "static block" lar class icinde "her seyden once" calistirilirlar

     static double pi;

    static String shape;

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static {
        pi = 3.14;
        System.out.println("Static block 1");
    }

    static{
        shape = "Circle";
        System.out.println("Static block 2");
    }

}
