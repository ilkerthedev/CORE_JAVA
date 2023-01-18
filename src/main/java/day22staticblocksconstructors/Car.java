package day22staticblocksconstructors;

/*
        Constructor nedir ?
        Class'dan obje uretmemize yarayan code block'laridir.

        Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
        Ama bu constructor gozle gorulmez, gozle gorulmeyen otomatik olarak java tarafindan verilen bu constructor'lara
        "default constructor" denir.

        "default constructor" lar "Car(){ }" seklindedir.

        Siz kendi constructor'inizi olusturdugunuzda Java default constructor'i siler.

        Bir Class'da farkli parametreler kullanarak istediginiz kadar constructor olusturabilirsiniz.

        Farkli constructor'lar sayesinde bir class'dan farkli farkli object'ler olusturabiliriz.

   *****Interview Question: Method ile Constructor'in farki var midir ? Varsa nedir ?
        Cevap:              Method ile Constructor farklidir yapilardir.
                            i)Method'larda "return type" vardir, ama constructor'larda "return type" yoktur.
                           ii)Method'larin ismi yaptiklari ise gore dev'ler tarafindan belirlenir.
                              Constructor'larin ismi ise her zaman Class ismi ile ayni olmalidir.

     */

public class Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    public Car(String make, String model, int year, boolean hybrid) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.year=0;
        this.hybrid=false;

    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
