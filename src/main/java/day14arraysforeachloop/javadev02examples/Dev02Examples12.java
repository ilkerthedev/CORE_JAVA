package day14arraysforeachloop.javadev02examples;

import java.util.Scanner;

public class Dev02Examples12 {

            /*
                    Verilen bir sayinin bolenlerini ve kac tane oldugunu veren kod
            */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir pozitif bir sayi giriniz.");
        int num = input.nextInt();

        pozitifBolen(num);

    }//main

    public static void pozitifBolen(int num) {

        int counter = 0;

        if (num > 0) {

            System.out.print("Pozitif bölenleri = ");

            for (int i = 1; i <= num; i++) {


                if (num % i == 0) {
                    System.out.print(i + ", ");
                    counter++;
                }

            }

            System.out.println();
            System.out.println(num + ", " + counter + " tane pozitif bolene sahiptir.");

            if (counter == 2) {
                System.out.println(num + ", Sayisi asaldir. ");
            }

        } else System.out.println("Lutfne pozitif bir sayi giriniz...");

    }


}//class




