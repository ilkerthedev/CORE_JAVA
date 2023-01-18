package day14arraysforeachloop.javadev02examples;

import java.util.Scanner;

public class Dev02Examples07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100den kucuk bir tam sayi giriniz...");
        int num = input.nextInt();

        if (num < 101 && num>0) {

            for (int i = 1; i < num; i++) {


                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("Java Guzeldir");
                } else if (i % 3 == 0) {
                    System.out.println("Java");
                } else if (i % 5 == 0) {
                    System.out.println("Guzeldir");
                } else System.out.println(i);
            }
        } else System.out.println("Lutfen gecerli bir sayi giriniz...");

    }//main

}//class
