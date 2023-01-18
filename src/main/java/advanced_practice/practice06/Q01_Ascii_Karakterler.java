package advanced_practice.practice06;

import java.util.Scanner;

public class Q01_Ascii_Karakterler {

    //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ilk characteri giriniz");
        char first = scan.next().charAt(0);
        System.out.println("Ikınci characteri giriniz");
        char second = scan.next().charAt(0);

        int min = Math.min(first,second);
        int max = Math.max(first,second);

        for (int i = min+1; i < max ; i++) {
            System.out.print((char) i+" ");
        }

    }//main

}//class
