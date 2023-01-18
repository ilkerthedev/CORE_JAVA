package day07ifstatements;

import java.util.Scanner;

public class IfStatement06 {

    public static void main(String[] args) {

        /*
        Example 1:  Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                    asagidaki tabloya gore yazdiran kodu olusturunuz
                    0-4 ==> bebek
                    5-12 ==> cocuk
                    13-20 ==> genc
                    21-30 ==> yetiskin
                    30 ustu ==> tanimlanmamis
                    Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        int age = input.nextInt();

        if (age < 0) {
            System.out.println("Gecerli bir yas giriniz");
        } else if (age < 5) {
            System.out.println("Bebek");
        } else if (age < 13) {
            System.out.println("Cocuk");
        } else if (age < 21) {
            System.out.println("Genc");
        } else if (age < 31) {
            System.out.println("Yetiskin");
        } else {
            System.out.println("Tanimlanmamis yas...");
        }

        /*
             Note: Ne kadar az if blogu ve ne kadar az mantiksal operatör o kadar hizli calismayi saglar.
             O nedenle negatif degerler mutlak deger ile egale edildi.
             Esitlik durumlari <> ile üst deger verilerek atlandi.
        */


    }//main body

}//class body
