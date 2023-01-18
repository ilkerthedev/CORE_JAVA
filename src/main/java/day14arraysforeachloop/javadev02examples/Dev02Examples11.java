package day14arraysforeachloop.javadev02examples;

import java.util.Scanner;

public class Dev02Examples11 {

    public static void main(String[] args) {

        /*
            Kullanicinin Girecegi Sayinin Asal sayi olup olmadigini veren kod
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = input.nextInt();
        Math.abs(num);

        asalSayi(num);


    }//main

    public static void asalSayi(int a){

        int m = 0, sum = 0;
        m = a/2;

        if (a==0 || a==1){
            System.out.println(a+" Asal sayi degildir");
        }else{

            for (int i = 2; i <= m ; i++) {

                if(a%i==0){
                    System.out.println(a+" Asal sayi degildir");
                    sum = 1;
                    break;
                }
            }

            if(sum==0){
                System.out.println(a+" Asal sayidir");
            }
        }


        /*

        public static void checkPrime(int num) {
        if (num > 0) {
            int count = 0;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }//for

            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }


        } else {
            System.out.println("Please Enter A positive Num");
        }

         */



    }

}//class

