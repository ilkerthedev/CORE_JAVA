package practice_makes_perfect.practiceDTNT;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        /*
                Kullanicidan bir gun alin
                Eger gun cuma ise "Muslumanlar icin Kutsal Gun" ;
                Eger gun cumartesi ise "Yahudiler icin Kutsal Gun" ;
                Eger gun pazar ise "Hristiyanlar icin Kutsal Gun" ;
                yazdiran kodu olusturunuz...
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gün ismi yazınız...");
        String s = input.next().toLowerCase();

        boolean isDayName = (s.equals("monday") || s.equals("tuesday") ||
                s.equals("wednesday") || s.equals("thursday") ||
                s.equals("friday") || s.equals("saturday") ||
                s.equals("sunday"));

        if (isDayName) {

            if (s.equals("friday")) {
                System.out.println("Muslumanlar icin Kutsal Gun");
            } else if (s.equals("saturday")) {
                System.out.println("Yahudiler icin Kutsal Gun");
            } else if (s.equals("sunday")) {
                System.out.println("Hristiyanlar icin Kutsal Gun");
            } else {
                System.out.println("Kutsal gun degil...");
            }
        } else {
            System.out.println("Lutfen gecerli bir gun giriniz");
        }


    }//main

}//class
