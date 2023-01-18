package day24accessmodifiersinheritance;

public class Vehicle {

    /*
        1)Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki
          paren class'dan baslatilarak alta dogru calistirilir.
     */

    public Vehicle() {
        System.out.println("Vehicle 1");
    }
}
