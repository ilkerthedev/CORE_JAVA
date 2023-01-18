package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {

    public static void main(String[] args) {

        //Example 1: String Array elemanlarini character sayisina gore kucukten buyuge siralayiniz...
        //           ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Tom", "Ajda", "Thomas", "Michael"]
        System.out.println("**********Example 1**********");

        String arr[] = {"Michael", "Ajda", "Thomas", "Tom"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));

        //Example 2: String Array elemanlarini character sayisina gore buyukten kucuge siralayiniz...
        //           ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Michael", "Thomas", "Cuneyt", "Ajda", "Tom"]
        System.out.println("**********Example 2**********");

        String brr[] = {"Michael", "Ajda", "Thomas", "Tom", "Cuneyt"};
        System.out.println(Arrays.toString(brr));

        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));

        //Example 3: String Array elemanlarini character sayisina gore buyukten kucuge siralayiniz.
        //           Ayni character sayisinda olanlari da alfabetik siraya koyunuz.
        //           ["Michael", "Ajda", "Reyhane", "Gabriel", "Thomas", "Tom", "Ali", "Cin", "Cuneyt", "Cem"]
        //           [ "Gabriel", "Michael", "Reyhane", "Cuneyt", "Thomas", "Ajda", "Ali", "Cem", "Cin", "Tom"]
        System.out.println("**********Example 3**********");
        //**********ONEMLI**********

        String crr[] = {"Michael", "Ajda", "Reyhane", "Gabriel", "Thomas", "Tom", "Ali", "Cin", "Cuneyt", "Cem"};
        System.out.println(Arrays.toString(crr));

        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));


    }//main

}//class
