package day27encapsulationabstraction;

public abstract class Courses {
    /*
        1)Bazen method body'sini yazmak gerekmez, bu durumlarda bodysiz method olusturmak gerekir.
          Body'si olmayan methodlara "abstract method" lar denir.

        2)"abstract method" lar child class'lar tarafindan "override" edilmek zorundadirlar.
          Bu yuzden, eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur kilmak isterseniz
          o method'u "abstract" yapmak gerekir.

        3)Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
          "access modifier" ile "return type" arasina "abstract" keyword koymak gerekir.

        4)"abstract method" lar siradan class'larin(concrete) icerisine yazilamazlar, "abstract method" larin icine yazdildiklari
          class'lar da abstract olmak zorundadirlar.

        5)"abstract class" larda hem "abstract method" lar hem de "concrete method" lar kullanilabilir.

        6)"concrete class" lar "abstract class" larin child'i olabilirler.
          "abstract method" larin "override" edilme zorunlulugu "concrete class" lar icindir.
     */

    public abstract void math();

    public void art() {
        System.out.println("Painting");
    }

    //final method'lar "override" edilemezler, halbuki "abstract method" lar override edilmek icin olusturulurlar.
    //Bu celiskidir, bu yuzden Java "abstract method" larin final olmasina musade etmez.
    //public final abstract void science();

    //Concrete Class'lar final oldugunda Child Class'a sahip olamazlar.
    //Ama "Abstract Class" lar icin Child Class olmalidir, cunku Child Class'lar abstract parent class'daki abstract
    // methodlari kullanilirlar. Bu yuzden, Java "Abstract Class" larin "final" olmasina musade etmez.

    //"abstract method" lar "private" olamazlar, cunku Child Class'lar abstract methodlari kullanirlar, private yapinca
    // kullanima kapali olur. Bu celiskidir, bu yuzden Java abstract method'larin private olmasina musade etmez.

    //"abstract method" lar "static" olamazlar, cunku static methodlar "override" edilemezler, halbuki abstract method'lar
    // "override" edilmek icin olusturulmustur.
}
