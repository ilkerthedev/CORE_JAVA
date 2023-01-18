package day07ifstatements;

import java.util.Scanner;

public class IfStatement05 {

    public static void main(String[] args) {

        //Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu olusturunuz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ay ismi giriniz...");
        String monthName = input.next();


        if (monthName.equalsIgnoreCase("January")) {
            System.out.println(1);
        } else if (monthName.equalsIgnoreCase("February")) {
            System.out.println(2);
        } else if (monthName.equalsIgnoreCase("March")) {
            System.out.println(3);
        } else if (monthName.equalsIgnoreCase("April")) {
            System.out.println(4);
        } else if (monthName.equalsIgnoreCase("May")) {
            System.out.println(5);
        } else if (monthName.equalsIgnoreCase("June")) {
            System.out.println(6);
        } else if (monthName.equalsIgnoreCase("July")) {
            System.out.println(7);
        } else if (monthName.equalsIgnoreCase("August")) {
            System.out.println(8);
        } else if (monthName.equalsIgnoreCase("September")) {
            System.out.println(9);
        } else if (monthName.equalsIgnoreCase("October")) {
            System.out.println(10);
        } else if (monthName.equalsIgnoreCase("November")) {
            System.out.println(11);
        } else if (monthName.equalsIgnoreCase("December")) {
            System.out.println(12);
        } else {
            System.out.println("Invalid month name...");
        }

        /*
                Note:String'lerin eşitliklerini kontrol ederken "==" yerine "equals()" kullanırız.
                     Niye?
                     Cunku; "==" sembolu iki String'i karsilastirirken hem adres'lerine hem de degerlerine bakar,
                     ikisi de ayni ise size String'ler esittir der ama biz code yazarken genellikle String'lerin
                     adres'leri ile degil degerleri ile ilgileniriz. Bu yüzden String karşılaştırmalarında(compare)
                     "==" kullanmayız

                     "equals()" methodu ise iki String'i karsilastirirken sadece degerlerine bakar degerler ayni ise
                     bu iki String esittir der degerler farkli ise bu iki String farklidir der ki bu bizim code yazar-
                     ken ihtiyac duydugumuz seydir.

                     **Stack Memory**
                     i)Primitive Data'lar depolanir.
                    ii)Non-Primitive'lerin adres'leri depolanır.(Reference)
                     **Heap Memory**
                     i)Non-Primitive'ler depolanir.
         */

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");
        String m = "Tom";

        System.out.println(s == t);//adres'ler ve degerler farkli
        System.out.println(s.equals(t));// false cunku; degerler farkli

        System.out.println(s == r);//false cunku adress'ler farkli
        System.out.println(s.equals(r));//true cunku equals() sadece degerlere bakar. "s" ve "r" nin degerleri ayni oldugundan true verir.

        System.out.println(s == m);//true
        System.out.println(s.equals(m));//true


    }//main body

}//class body
