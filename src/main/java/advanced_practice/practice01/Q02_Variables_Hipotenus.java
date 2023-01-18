package advanced_practice.practice01;

import java.util.Scanner;

public class Q02_Variables_Hipotenus {

    //Hipotenüs hesaplayan bir kod yazınız.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1. dik kenar uzunlugu giriniz");
        double a = input.nextDouble();
        System.out.println("2. dik kenar uzunlugu giriniz");
        double b = input.nextDouble();

        double c = Math.sqrt(a*a+b*b);
        System.out.println("Hipotenus: "+c);
        System.out.println((int)c);
        System.out.printf("%.2f", c);




    }//main

}//class
