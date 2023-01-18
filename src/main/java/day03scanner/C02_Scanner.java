package day03scanner;

import java.util.Scanner;

public class C02_Scanner {

    //Scanner classi kullanıcı ile etkileşim kurmamızı sağlar.
    //Scanner bir Class'tır.
    //Java util kutuphanesinden getirildiği için import ister.


    public static void main(String[] args) {

        //Kullanıcıdan data almak için
        //1) Scanner Classından object olusturun

        Scanner input = new Scanner(System.in);

        //2) Kullanıcıya ne yapacağını söyle

        System.out.println("Lütfen yaşınızı giriniz");

        //3) Kullanıcıdan aldığınız datayı variable içine koyun

        byte age = input.nextByte();


        // Kullanıcıya Ad, Memleket, Yaş, Boy, Yaşadığı yeri sevip sevmediği, soran bir program yazınız

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String userName = scan.nextLine();   //Kullanıcıdan String bir değer istedik tüm satırı alması için nextLine

        System.out.println("Lütfen memleketinizi giriniz");
        String userFrom = scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        short userAge = scan.nextShort();

        System.out.println("Lütfen boyunuzu giriniz");
        double userHeight = scan.nextDouble();

        System.out.println("Lütfen yaşadığınız yeri sevip sevmediğinizi yazınız");
        boolean didULike = scan.nextBoolean();

        System.out.println("************************");
        System.out.println("userName = " + userName);
        System.out.println("userFrom = " + userFrom);
        System.out.println("userAge = " + userAge);
        System.out.println("userHeight = " + userHeight);
        System.out.println("didULike = " + didULike);





    }//main body

}//class body
