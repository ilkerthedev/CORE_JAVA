package practice_makes_perfect.practiceDTNT;

import java.util.Scanner;

public class C03_Ternary {

    /*
            Kullanicidan sifirdan buyuk pozitif bir tamsayi girmesini isteyin
            Girilen pozitif tamsayi 3 basamakli ise ekrana "3 Basamakli " yazdirin
            3 basamakli degilse cift olup olmadigini kontrol edin
            Cift ise "3 basamakli olmayan cift sayi" yazdirin
            Cift degilse " 3 basamakli olmayan tek sayi" yazdirin
 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = input.nextInt();

        System.out.println("********* if ile cozumu***************");


        if (sayi > 0) {
            boolean sifirdanBuyukUcBas = sayi > 99 && sayi < 1000;
            boolean sifirdanBuyukUcBasOlmayanCift = sayi % 2 == 0;


            if (sifirdanBuyukUcBas) {
                System.out.println("3 basamakli sayi ");
            } else if (sifirdanBuyukUcBasOlmayanCift) {
                System.out.println("3 basamakli olanmayan pozitif cift sayi");
            } else
                System.out.println("3 basamakli olmayan pozitif tek sayi");
        } else {//negatif sayilar icin burasi calisr
            System.out.println("Lutfen pozitif bir tamsayi giriniz");
        }//if body

        System.out.println("********** Ternary **********");
        boolean sifirdanBuyukUcBasTer = sayi > 99 && sayi < 1000;
        boolean sifirdanBuyukUcBasOlmayanCiftTer = sayi % 2 == 0;

        String sonuc = sayi>0 ? sifirdanBuyukUcBasTer ? ("3 Basamakli Sayi"):sifirdanBuyukUcBasOlmayanCiftTer ? ("3 Basamakli olmayan cift sayi"): ("3 Basamakli olmayan tek sayi") : ("Lutfen pozitif bir tamsayi giriniz");

        System.out.println(sonuc);


    }//main

}//class
