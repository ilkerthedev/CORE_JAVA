package dev02.dev02day03;

import java.util.Scanner;

public class TekTamSayi {

    //20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk bırakarak yazdırmak için gereken kodu yazınız.

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Iki tane tam sayiyi sirayla giriniz");
        int num1 = inp.nextInt();
        int num2 = inp.nextInt();

        int min = Math.min(num1,num2);
        int max = Math.max(num1,num2);

        for (int i = max; i > min ; i--) {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }


    }

}
