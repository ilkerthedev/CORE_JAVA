package dev02.dev02day01;

import java.util.Scanner;

public class AsalSayi {
    // Belirli bir sayıdan küçük tüm asal sayıları yazdıran bir kod yazınız. Örnek: kullanıcı 20 girerse çıktı 2, 3, 5, 7, 11, 13, 17, 19 olacaktır.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir dogal sayi giriniz");
        int num = scan.nextInt();

        System.out.print("2 ");
        for (int i = 2; i < num; i++) {
            for (int j = 2; j < i ; j++) {
                if (i%j==0){
                    break;
                }else if(j==i-1 && i%j!=0){
                    System.out.print(i+" ");
                }
            }//inner
        }//outer
    }//main
}//class



