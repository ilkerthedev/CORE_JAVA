package day34mapsiterators;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    /*
        Iterators'lar Loop'ların yaptığı işi yapar.
        Iteratorslar tıpkı loop'ta olduğu gibi elemanı alarak işleme sokar.
        Javanın Iterators'ları ortaya çıkarma sebebi Infinite Loop riskini bitirmektir.
        Iterator'larda sonsuz loop yoktur..
        Iterator'lar Java tarafından sonradan oluşturulmuşlardır ve loop'ların yaptıkları bütün işlemleri yaparlar.
        Loop'lar ile Iterator'larin performans farki yoktur ama Iterator'lar eleman silme ve update etmede daha basarililardir.

        Iki tip Iterator var;
        i)Iterator: Sadece eleman'lari remove edebilirsiniz
                    Sadece sol'dan sag'a calisir yani tek yonludur.
       ii)ListIterator: Elemani remove etme ve update etme yapabilirsiniz.
                        Hem sol'dan sag'a hem de sag'dan sol'a calisabilir yani cift yonludur.
 */

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");

        Iterator<String> itr1 = list1.iterator();

        System.out.println(list1);// [Ali, Can, Aliye]

        while (itr1.hasNext()){

            itr1.next();

            itr1.remove();

        }

        System.out.println(list1);// []

        List<String> list2 = new ArrayList<>();
        list2.add("Ali");
        list2.add("Can");
        list2.add("Aliye");
        System.out.println(list2);// [Ali, Can, Aliye]

        ListIterator<String> listItr = list2.listIterator();

        while (listItr.hasNext()){

            String el = listItr.next();

            listItr.set(el+"!");
        }
        System.out.println(list2);// [Ali!, Can!, Aliye!]

        //Example 2:
        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);// [Ali, Can, Aliye]

        ListIterator<String> listItr2 = list3.listIterator();

        while (listItr2.hasNext()){
            listItr2.next();
        }

        while (listItr2.hasPrevious()){
            String el = listItr2.previous();
            System.out.println(el+" <==");// Aliye <== , Can <== , Ali <==
        }

    }

}
