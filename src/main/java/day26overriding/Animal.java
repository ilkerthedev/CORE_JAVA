package day26overriding;
/*
        1)Parent Class'daki method'u Child Class icinde ozellestirerek kullanmaya "Overriding" yapmak denir.
        2)Overriding'de method'un parantezine, method'un ismine dokunulmaz; method'un body'si degistirilir.
        3)@Override --> Override Annotation: Override kurallarinin Java tarafindan kontrol edilmesini saglar.
        4)Overriding'de parent class'daki method'a "Overridden Method", child class'daki method'a ise "Overriding Method" denir.
        5)"private" method'lar "override" edilemezler.
        6)Child Class'daki override edilmis method(Overriding Method)'un
          access modifier'i Parent Class'daki override edilmis method(Overridden Method)'un
          access modifier'indan dar olamaz
          Overridden Method ==> protected ise Overriding Method ==> protected + public
          Overridden Method ==> default ise Overriding Method ==> default + protected + public
          Overridden Method ==> private ise Overriding Method ==> override olmaz ki access modifier'i olsun. (Bkz 5. kural)
        7)Child Class'da override edilen method'un(Overriding Method) return type'i method'un return ettigi data type'inin aynisi veya
          o data type'inin parent'i olarak secilir.
        8)Method'un return type'i "primitive" ise, Overriding yaparken return type degistirilemez.
          Cunku; return type ya ayni olur ya da parent'dan secilir ama primitive'ler arasinda "parent-child" iliskisi yoktur.
        9)Method'un return type'i "Wrapper Class" ise, Overriding yaparken return type degistirilemez.
          Cunku; return type ya ayni olur ya da parent'dan secilir ama Java bir wrapper class'i digerinin parent'i yapmadigindan
          parent'dan secme ihtimali yoktur, geriye sadece aynisi olma ihtimali kalir.
       10)Method'un return type'i "void" ise, Overriding yaparken return type degistirilemez.

       11) Final kelimesini "Variable"larda kullanabilirsiniz.
                                ->final variable ise
                                i) mutlaka değer atanmalıdır
                                ii) ilk atanan değer değiştirilemez

       12)Final kelimesini "Method" larda kullanabilirsiniz.
                                 ->method final ise;
                                  i)methodun body'si değiştirilemez
                                  ii)method body'si değiştirilemeyince override yapmak mümkün olmaz

       13)Final kelimesini "Class"larda kullanabilirsiniz.
                                 ->class final ise;
                                   i)o class'ın child'ı olamaz
       14)"final" method'lar ve "static" method'lar "override" edilemezler.
       15)"Override" yapabilmek icin "Inheritance" sarttir. Baska bir ifadeyle; Parent-Child iliskisi sarttir.
       16)Method Overloading "Compile Time Polymorphism" dir,
          Method Overriding  "Run Time Polymorphism" dir.

       17)Method Overloading "Static Polymorphism" dir,
          Method Overriding  "Dynamic Polymorphism" dir.

          Overloading (Compile Time)(Static) Polymorphism
          public int add(){};
          public int add(int a){};
          public int add(int a,int b){};

          Overriding (Run time)(Dynamic) Polymorphism
          public int add(){a};
          public int add(){a+b};
          public int add(){a+b+2+5};



 */

public class Animal {

    public void eat(){//// Parent'daki override edilmis eat() method'una "Overridden Method" denir.
        System.out.println("Animals eat");
    }

    public void drink(){
        System.out.println("Animals drink");
    }

    public Animal create(){
        return new Animal();
    }

    public int add(int a, int b){
        return a+b;
    }

    public Integer multiply(int a,int b){
        return a*b;
    }

}
