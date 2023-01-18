package day12forloopwhileloop;

public class WhileLoop01 {

    public static void main(String[] args) {

        //Example 1: 3'den 10'a kadar tam sayilari consela'a yazdiriniz.

        //1. Yol: for-loop
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //2. Yol: while-loop

        int i = 3;

        while (i < 11) {

            System.out.print(i + " ");

            i++;
        }

        System.out.println();

        //Example 2: 23'den 12'ye kadar cift tam sayilari console'a yazdiriniz.

        int k = 23;

        while (k > 11) {

            if (k % 2 == 0) {
                System.out.print(k + " ");
            }

            k--;
        }

        System.out.println();

        //Example 3: Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz.

        int sum = 0;
        int say = -578;

        say = Math.abs(say);

        while (say > 0) {

            sum = sum + say % 10;

            say /= 10;
        }
        System.out.println(sum);

        //for hali

        int a = 684;
        int toplam = 0;

        for (int j = a; j > 0 ; j/=10) {

            toplam += j%10;

        }

        System.out.println(toplam);








    }//main

}//class
