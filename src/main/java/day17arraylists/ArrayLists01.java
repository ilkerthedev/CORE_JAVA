package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists01 {

    /*
        1)ArrayList(List)'ler coklu data depolamak icin kullanilir.
        2)ArrayList(List)'ler non-primitive data type'indaki coklu datalari depolamak icin kullanilir.
          -List'ler "non-primitive" data kabul ederler, Array'ler ise "primitive" data veya "reference" kabul eder.
        3)ArrayList(List)'leri olustururken icine koyacaginiz eleman sayisini basta belirtmenize gerek yoktur.
          -List'ler eleman sayisinda "flexible" dirlar ama Array'ler "flexible" degildirler.
        4)Madem "Array" ler eleman sayisinda flexible degil nicin Java "Array" leri iptal etmedi?
          -Eleman sayisi belli olan data'lari depolamak icin Array'ler tercih edilir.
          -Array'ler cok hizli calisir.
          -Array'ler memory'de cok az yer kaplar.
     */

    public static void main(String[] args) {

        //List nasil olusturulur ?
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);// []

        //List'lere eleman nasil eklenir?
        //add() method'unu kullaniriz.
        //add() method'u elemanlari sizin verdiginiz sirada "list" e ekler. (Insertion Order)
        ages.add(12);
        ages.add(9);
        ages.add(10);

        ages.add(1, 656);
        ages.add(3, 777);
        ages.add(888);

        System.out.println(ages);// [12, 656, 9, 777, 10, 888]

        //List'e coklu eleman nasil eklenir? veya List'e baska bir List nasil eklenir?
        //Bir "List" e coklu eleman eklemek icin o elemanlari once bir List'in icine koymalisiniz.

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2, newAges);
        System.out.println(ages);// [12, 656, 8, 9, 10, 9, 777, 10, 888, 8, 9, 10]

        //Bir List'teki tum elemanlari nasil silebilirim?
//        ages.clear();
//        System.out.println(ages);// []

        //contains() methodu: List'te elamanin var olup olmadigina bakar boolean dondurur.
        System.out.println(ages.contains(656));

        //Bir List'in baska bir List ile ayni olup olmadigini nasil kontrol ederiz?
        //Iki List'in esit olabilmesi icin ayni index'de ayni elemanlar olmalidir.
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        System.out.println(names1.equals(names2));// false

        //Example 1: Verilen iki Integer List'de tamamiyla ayni elemanlarin olup olmadigini
        //           kontrol eden kodu yaziniz.

        ArrayList<Integer>nums1=new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer>nums2=new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        //Collections.sort() List'deki elemanları alıp küçükten büyüğe sıraladı.
        Collections.sort(nums1);
        Collections.sort(nums2);

        boolean t= nums1.equals(nums2);
        System.out.println(t);


    }//main

}//class
