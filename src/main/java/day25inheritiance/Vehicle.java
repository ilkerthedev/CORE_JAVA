package day25inheritiance;

public class Vehicle {

    /*
        1)Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki
          paren class'dan baslatilarak alta dogru calistirilir.
     Note:super() parent'daki constructor'i calistirmaya yarar.
        2)Child Class'daki constructordan Parent Class'daki constructor'a gidebilmek icin "super()" kullanilir.
        3)Parent Class'da birden fazla constructor varsa istenilen constructor, super() ifadesinin parentezi icine yazilan
          parametreler yardimi ile secilebilir.
        4)Ayni Class icindeki constructor'lari secmek icin this() kullanilir.
          Ayni Class'da birden fazla constructor varsa istenilen constructor, "this()" ifadesinin parentezi icine yazilan
          parametreler yardimi ile secilebilir.
        5)"super()" ifadesini yazmak istege baglidir, yazmasaniz da Java sanki "super()" varmis gibi davranir.
          Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
        6)"super()" ve "this()" ifadeleri constructor icinde her zaman ilk satirda olmalidir.
        7)Bir constructor icinde "super()" ve "this()" ifadeleri sadece bir kere ve yalnizca bir tanesi kullanilabilir.
        8)Inheritance'da variable'lari ve method'lari cagirmak icin "this" veya "super" kullanilir.
          "this" ayni class icindeki variable'lari ve method'lari cagirmak icin kullanilir.
          "super" parent class icindeki variable'lari ve method'lari cagirmak icin kullanilir.
        9) Inheritance'da Object kullanarak variable cagirirsanizi, Object'in data tipini temsil eden class'dan variable'i
           aramaya baslayiniz. O class da yoksa parent'lara bakiniz
       10) Inheritace'da Object kullanarak method cagirirsaniz Object'in constructor'ini temsil eden class'dan methodu aramaya baslayiniz
            o class'da yoksa parent'lara bakiniz.

            OOP Principals:
            i)Inheritance +
           ii)Polymorphism: Method Overloading + Method Override
          iii)Encapsulation -
           iv)Abstraction -

     */
    public int price = 12000;

    public void engine(){
        System.out.println("Vehicle engine..");
    }

    public Vehicle() {
        System.out.println("Vehicle 1");
    }

    public Vehicle(int price){
        System.out.println("Vehicle 2: "+price);
    }

}
