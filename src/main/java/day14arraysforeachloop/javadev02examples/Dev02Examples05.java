package day14arraysforeachloop.javadev02examples;

import java.util.Scanner;

public class Dev02Examples05 {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    char ch = input.next().charAt(0);

        boolean isLetter = ch>='a' && ch<='z' || ch>='A' && ch<='Z';

        String result = isLetter ? "Girilen character harf" : "Girilen character harf degil";

        System.out.println(result);

    }//main

}//class
