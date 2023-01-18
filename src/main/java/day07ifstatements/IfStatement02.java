package day07ifstatements;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        //Example 2:Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num = input.nextInt();

        //1. Yol:
//        if(num%2==0){
//            System.out.println("Cift sayi...");
//        }
//
//        if(num%2!=0){
//            System.out.println("Tek sayi...");
//        }

        //2. Yol:

        if(num%2==0){
            System.out.println("Cift sayi...");
        }else{
            System.out.println("Tek sayi...");
        }




    }//main body

}//class body
