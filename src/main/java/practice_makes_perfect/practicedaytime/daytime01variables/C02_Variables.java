package practice_makes_perfect.practicedaytime.daytime01variables;

import java.util.Scanner;

public class C02_Variables {

     /*
         TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy,
         salona devam edeceği ay süresi
         bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
     */

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("TechProEd Spor Salonuna hoşgeldiniz...");

        System.out.println("Lütfen isim soyisim giriniz...");
        String nameSurname = input.nextLine();

        System.out.println("Lütfen yaşınızı giriniz...");
        byte age = input.nextByte();

        System.out.println("Lütfen kilonuzu giriniz...");
        double weight = input.nextDouble();

        System.out.println("Lütfen boyunuzu giriniz...");
        double height = input.nextDouble();
        //***********************
        int aylik_ucret = 20;
        System.out.println("aylik_ucret = " + aylik_ucret);
        //***********************
        System.out.println("Lütfen kaç aylık üyelik satın alıcağınızı giriniz...");
        byte month = input.nextByte();


        int totalPrice = aylik_ucret*month;

        System.out.println("\nIsim Soyisim: "+nameSurname+"\n"+"Yas: "+age+"\n"+"Kilo: "+weight+"\n"+"Boy: "+height+"\n"
        +"Odemeniz gereken toplam tutar: "+totalPrice+"$");











    }//main body

}//class body
