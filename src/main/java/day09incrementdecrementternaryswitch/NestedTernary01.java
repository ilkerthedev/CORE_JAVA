package day09incrementdecrementternaryswitch;

import java.util.Scanner;

public class NestedTernary01 {

    public static void main(String[] args) {

        int y = 8;

        int r1 = (y > 5) ? (y < 10 ? 2 * y : 3 * y) : (y < 10 ? 2 + y : 3 + y);

        /*
           *****Example 1: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
                           1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600 ==> Leap | 18000 ==> Leap degildir.
                           2)Yil 100e bolunmuyorsa 4'e bolunmelidir. 2004 ==> Leap | 2005 ==> Leap degildir.
                           (Interview)
        */

        int year = 2020;

        String result = year%100==0 ? (year%400==0 ? "Leap" : "Not Leap") : (year%4==0 ? "Leap" : "Not Leap");

        System.out.println(result);


    }//main

}//class
