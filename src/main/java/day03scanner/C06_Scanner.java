package day03scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        //Kullanıcıdan aldığınız şekil ile aşşağıdaki gibi bir görsel oluşturunuz

      /*
                   A
                  A A
                 A A A
      */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir karakter giriniz...");
        char ch = input.next().charAt(0);

        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);




    }//method body

}//class body
