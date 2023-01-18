package day03scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        //EX 1) Kullanıcıdan sayıları alarak toplama işlemi yaptıran kodu yazınız

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen \"x\" sayısını giriniz");
        double x = input.nextDouble();
        System.out.println("Lütfen \"y\" sayısını giriniz");
        double y = input.nextDouble();

        System.out.println("Toplam "+(x+y));



    }//main body


}//class body

