package day03scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

    //Kullanıcıdan bir dikdörtgenin en ve boyunu alarak dikdörtgenin alanını ve çevresini hesaplayan kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin uzun kenarını giriniz");

        int longSide = input.nextInt();

        System.out.println("Lütfen dikdörtgenin kısa kenarını giriniz");

        int shortSide = input.nextInt();

        System.out.println("Dikdörtgenin Alanı ==> "+(shortSide*longSide));
        System.out.println("Dikdörtgenin Çevresi ==> "+ 2*(shortSide+longSide));


    }//method body

}//class body
