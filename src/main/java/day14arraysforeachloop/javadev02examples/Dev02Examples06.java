package day14arraysforeachloop.javadev02examples;

import java.util.Scanner;

public class Dev02Examples06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        byte num = input.nextByte();

        if (num < 50 && num > -1) {
            System.out.println('D');
        } else if (num > 49 && num < 60) {
            System.out.println('C');
        } else if (num > 59 && num < 80) {
            System.out.println('B');
        } else if (num > 79 && num < 101) {
            System.out.println('A');
        } else System.out.println("Gecerli bir not giriniz...");

    }//main

}//class
