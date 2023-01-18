package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {

        /*
                Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz.
                           3 ==> 3x1=3 3x2=6
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");

        double num = input.nextDouble();

        int sum = 1;

        while (sum < 11) {

            System.out.println(num + "x" + sum + "= " + (num * sum));

            sum++;
        }

        //Example 2: Verilen bir String'de her harfin sonrasina "*" sembolunu ekleyiniz.
        //           Java ==> J*a*v*a

        System.out.println("Bir kelime giriniz.");
        String word = input.next();

        int k = 0;

        while(k<word.length()){

            char ch = word.charAt(k);

            if(k == word.length()-1){
                System.out.println(ch);

            }else System.out.print(ch+"*");

            k++;
        }

    }//main

}//class
