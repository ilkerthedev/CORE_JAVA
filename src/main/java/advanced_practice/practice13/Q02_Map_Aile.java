package advanced_practice.practice13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q02_Map_Aile {
    //Ad-Soyad-Yaş ve kardeşler listesini tek bir Map içerisinde saklayan bir kod yazınız.

    public static void main(String[] args) {

        Aile ali = new Aile("Ali","Can",12,"Ahmet","Hayriye");
        System.out.println("ali.getAileMap() = " + ali.getAileMap());

        Aile veli = new Aile("Veli","Han",15,"Mehmet","Hatice","Hasan","Hüseyin");
        System.out.println("veli.getAileMap() = " + veli.getAileMap());

        Aile ayse = new Aile("Ayşe","Kan",35,"Fatma");
        System.out.println("ayse = " + ayse);


    }
}