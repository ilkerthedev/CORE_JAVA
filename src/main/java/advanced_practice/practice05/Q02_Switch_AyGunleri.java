package advanced_practice.practice05;

import java.util.Scanner;

public class Q02_Switch_AyGunleri {

    /*
           Girilen yıl ve ay numarasına göre ayın kaç gün olduğunu yazdıran bir kod yazınız.
           Girdi yıl: 2000 ay: 2
           Çıktı: 29
      */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Yıl giriniz");
        int year;
        do {
             year = input.nextInt();
             if (year > -1){
                 break;
             }else System.out.println("Lutfen gecerli bir yil giriniz");
        }while (true);

        System.out.println("Ay giriniz");
        int month = input.nextInt();

        switch (month){

            case 1: case 3: case 5 : case 7 : case 8 : case 10 : case 12:
                System.out.println("Girdiginiz ayin gun sayisi: 31");
                break;
            case 4: case 6: case 9 : case 11 :
                System.out.println("Girdiginiz ayin gun sayisi: 30");
                break;
            case 2 :
                if (year%4==0 && year%100!=0 || year%400==0){
                    System.out.println("Girdiginiz ayin gun sayisi: 29");
                }else System.out.println("Girdiginiz ayin gun sayisi: 28");
                break;
            default:
                System.out.println("Gecerli bir ay numarasi giriniz");
        }






    }

}
