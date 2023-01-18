package advanced_practice.practice01;

import java.util.Scanner;

public class Q06_WhileLoop_IlkVeSonRakam {

    //Kullanıcıdan alınan bir sayının ilk ve son rakamlarını toplayan bir kod yazınız.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen en az 2 basamakli bir tam sayi giriniz...");
        int num = input.nextInt();

        //1. Yol:
        int sonRakam = num%10;
        System.out.println("sonRakam = " + sonRakam);

        int ilkRakam = num;

        while (ilkRakam>9){

            ilkRakam /= 10;

        }
        System.out.println("ilkRakam = " + ilkRakam);
        System.out.println("Toplam: "+(ilkRakam+sonRakam));

        //2. Yol:
        System.out.println("==String Ile==");
        String numString = String.valueOf(num);
        int strIlkRakam = Integer.parseInt(numString.substring(0,1));
        int strSonRakam = Integer.parseInt(numString.substring(numString.length()-1));

        System.out.println("Toplam: "+(strSonRakam+strIlkRakam));

    }//main

}//class

