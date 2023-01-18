package day14arraysforeachloop.javadev02examples;

import java.util.Scanner;

public class Dev02Examples03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz...");
        int num1 = input.nextInt();
        int num2 = input.nextInt();


        if(num1>0 && num2>0 ){
            System.out.println(num1+num2);
        }else if (num1<0 && num2<0){
            System.out.println(num1*num2);
        }else if(num1*num2<0){
            System.out.println("Farkli isaretlerde sayilarla islem yapamazsin");
        }else{
            System.out.println("Sifir carpmaya gore yutan elamandir...");
        }


    }//main body

}//class body
