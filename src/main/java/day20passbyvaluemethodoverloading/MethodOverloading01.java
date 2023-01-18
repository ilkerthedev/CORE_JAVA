package day20passbyvaluemethodoverloading;

public class MethodOverloading01 {

    /*
        1)Method Overloading yaparken method ismi degistirilmez.

        2)Method Overloading yaparken parametreler degistirilir.
            i)Patametre degistirirken, parametrelerin data type'lari degistirilebilir.
           ii)Patametre degistirirken, "parametrelerin data type'lari farkli ise" yerleri degistirilebilir.
          iii)Patametre degistirirken, parametrelerin sayisi degistirilebilir.

        3)Java icin "ismi" ve "parametreleri" ayni olan iki method tamamiyla aynidir.
          Bu yuzden "ismi" ve "parametre" "Method Signature" olarak adlandirilir.

        4)Method Overloading olustururken return type'i degistirmenin hicbir etkisi yoktur.
          Method Overloading olustururken access modifier'i degistirmenin hicbir etkisi yoktur.
          Method Overloading olustururken method body'i degistirmenin hicbir etkisi yoktur.

        5)"private" method'lar overload edilebilir. Cunku method overloading sadece bir class'in icinde olur.
          "private" olmak ise baska classlara gidildiginde problem olusturur.

        6)"static" method'lar overload edilebilirler.

     */

    public static void main(String[] args) {
        add(3,5);
    }

    public static void add(int a, int b){// 0 auto widening
        System.out.println(a+b);
    }

    public static void add(double a, double b){// 2 auto widening
        System.out.println(a+b);
    }

    public static void add(double a, int b){// 1 auto widening
        System.out.println(a+b);
    }

    public static void add(int a, double b){// 1 auto widening
        System.out.println(a+b);
    }

    public static void add(int a, int b, int c){ // 3 parameters
        System.out.println(a+b+c);
    }

}
