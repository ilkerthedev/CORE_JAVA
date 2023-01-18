package dev02.dev02day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Armstrong {

    //Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır.
    // Örneğin, 153, her basamağın küpüne eşit olan 153= 1 + 125 + 27 olduğundan bir Armstrong sayısıdır.
    // Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek için bir kod yazınız.

    public static void main(String[] args) {

     start();

    }

    public static void start(){
    Scanner scan = new Scanner(System.in);
    List<Integer> basamaklar = new ArrayList<>();
        System.out.println("Lutfen bir tamsayi giriniz");
        int num = scan.nextInt();
        int numcopy = num;

        while(num>0){
            basamaklar.add(num%10);

            num = num/10;
        }

        int sonuc = Armstrong.isArmStrong(basamaklar);

        if (sonuc == numcopy){
            System.out.println("Sayi armstrongdur");
        }else System.out.println("Sayi armstrong degildir");

    }

    public static int isArmStrong(List<Integer> basamaklar){
        int kup = 0;
        for (int i = 0; i < basamaklar.size(); i++) {

            int sayi = basamaklar.get(i);
            kup += sayi*sayi*sayi;
        }
        return kup;
    }

}


