package day24accessmodifiersinheritance;

import dev02.dev02day02.GrandOOP;

public class Animal {

    /*
        Inheritance'in(Miras) faydalari;
        1) Code standardında tekrar iyi değildir.
        2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
        3) Gelişime update'e açık olmalıdır
        4) Code atomic yapıda olmalı.
       Note 01:  "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
       Note 02: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
       Note 03: "public" method'lar child class'lar tarafindan kullanilabilir.
                "child class'lar tarafindan kullanilabilir" demek "inherit edilebilir" demektir.
       Note 04: "protected" method'lar "inherit edilebilir"
                Cunku "protected" olan method ve variable'lar child'lar tarafindan kullanilir.
       Note 05: "default" method'lar obje ile ayni package'de olduklari surece "inherit edilebilir"
                Ama default method ile object'in uretildigi class farkli package'lerde ise "inherit edilemezler"
       Note 06: "private" method'lar "inherit edilemezler".
       Note 07: Java "birden fazla parent"i(multiple intheritance Java tarafından desteklenmez) onaylamaz
       Note 08: Child --> Parent --> Grand Parent --> Grand Grand Parent ... seklinde ilerleyen inheritance'lara
                "Multi Level Inheritance" denir.
       Note 09: Java'da "Object Class" tum Java Class'larinin ortak parent'idir.
       Note 10: Java'da "Object Class" haric tum class'larin parent'i vardir.
       Note 11: Java'da "parent" dan "child" a olan iliskilere "HAS-A Relationship" denir.
                Java'da "child" dan "parent" a olan iliskilere "IS-A Relationship" denir.
       Note 12: Java'da her class'in bir tane default constructor'i vardir.
                Bu default constructor class'in icinde gorunmez cunku default constructor "Object Class" icindedir.
                Bizim class'imiz default constructor'a ihtiyac duydugunda parent olan "Object Class" a gider
                 ve oradaki constructor'i kullanir.
     */

    protected void eat(){
        System.out.println("Animals eat...");
    }

    void drink(){
        System.out.println("Animals drink...");
    }



}
