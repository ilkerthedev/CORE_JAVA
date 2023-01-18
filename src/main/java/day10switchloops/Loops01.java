package day10switchloops;

public class Loops01 {

    /*
            Code Standarts
            i)Tekrar(Repetition) olmamalidir.
           ii)Dynamic olmalidir.
          iii)Tamir(Fix) ve update kolay yapilabilmelidir.
     */

    public static void main(String[] args) {

        //Example 1: Ekrana 5 kere "Hi!" yazdiriniz.
        //1.Yol: Tavsiye edilmez
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        //2.Yol:
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop" lar kullanilir.
        //Dort tane loop var; i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //i)for-loop
        //   Baslangic degeri;Loop'un calisma sarti;Increment/Decrement
        for(int i =1         ;i<6                  ;i++                ){

            System.out.println("Hi!");

        }

        System.out.println("***************************************");


        //Example 2: 11'den 44'e kadar tum tamsayilari ekrana yazdiran kodu olusturunuz.

        for (int i = 11; i < 45; i++) {
            System.out.print(i+",");

        }

        //Example 3: //example :40 dan 23 e kadar tüm çift tam sayıları ekrana yazdır.

        System.out.println("");
        System.out.println("***************************************");

        for (int i = 40; i >22 ; i --) {

            if(i%2==0){
                System.out.print(i+",");
            }

        }

        System.out.println("");
        System.out.println("***************************************");
        //Example 4:

        for (int i = 18; i <57 ; i++) {

            if(i%2!=0){
                System.out.print(i+",");
            }

        }









    }//main

}//class
