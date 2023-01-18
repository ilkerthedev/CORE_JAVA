package day03scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //EX: Kullanıcıdan alacağınız 5 basamaklı bir sayının ilk iki ve son iki basamağındaki rakamları
        // toplamını yazdıran kodu oluşturunuz

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 5 basamaklı bir sayı giriniz");

        int number = input.nextInt(); //12345
        int ilkIkiRkm = number / 1000;
        System.out.println("ilkIkıRkm = " + ilkIkiRkm);

        //****  "%" kalanı verir , "/" bölümü verir  ****
        int ilkIkiTop = (ilkIkiRkm % 10) + (ilkIkiRkm / 10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);

        System.out.println("****************");

        int sonIkiRkm = number % 100;
        System.out.println("sonIkiRkm = " + sonIkiRkm);

        int sonIkiTop = (sonIkiRkm % 10 + sonIkiRkm / 10);
        System.out.println("sonIkiTop = " + sonIkiTop);

        System.out.println("****************");
        System.out.println("Sonuç ==> "+(sonIkiTop+ilkIkiTop));


    }//main body

}//class body
