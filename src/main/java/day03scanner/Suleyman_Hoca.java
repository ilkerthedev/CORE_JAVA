package day03scanner;

import java.util.Scanner;

public class Suleyman_Hoca {

    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("5 basamakli bir sayi giriniz...");

        int number = input.nextInt();

        //Son rakami al
        int lastDigit = number%10;
        number = number/10;

        //Sondan ikinci rakami al
        int lastSecondDigit = number%10;
        number = number/10;

        //Sondan ucuncu rakami al
        int lastThirdDigit = number%10;
        number = number/10;

        //Sondan dorduncu rakami al
        int lastFourthDigit = number%10;
        number = number/10;

        //Sondan besinci rakami al
        int lastFifthDigit = number%10;

        System.out.println(lastDigit + lastSecondDigit + lastFourthDigit + lastFifthDigit);
    }

}
