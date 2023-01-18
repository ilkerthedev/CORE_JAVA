package practice_makes_perfect.practiceDTNT;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {

        /*
                Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
                dort islemden biri ile isleme koyup yazdırınız.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yapacaginiz islemi seciniz;\nToplama icin ==>1\nCikartma yapmak icin ==>2" +
                "\nCarpma yapmak icin ==>3\nBolme Yapmak icin ==>4 giriniz.");
        int islem = input.nextInt();

        boolean first = !(islem==1 || islem==2 || islem==3 || islem==4);

        if (first){
            System.out.println("Lutfen gecerli bir numara giriniz");
        }else {
            System.out.println("Lutfen islem yapmak istediginiz 2 tamsayı giriniz...");
        }

        double num1 = input.nextDouble(); //1. sayi assign
        double num2 = input.nextDouble(); //2. sayi assign

        if (islem == 1) {
            System.out.println("Toplama isleminin sonucu = " + num1 + "+" + num2 + "=" + (num1 + num2));
        } else if (islem == 2) {
            System.out.println("Cikarma isleminin sonucu = " + num1 + "-" + num2 + "=" + (num1 - num2));
        } else if (islem == 3) {
            System.out.println("Carpma isleminin sonucu = " + num1 + "x" + num2 + "=" + (num1 * num2));
        } else if (islem == 4) {
            System.out.println("Bolme isleminin sonucu = " + num1 + "/" + num2 + "=" + (num1 / num2));
        } else
            System.out.println("Hatali secim yaptiniz lutfen tekrar deneyiniz...");


    }//main

}//class
