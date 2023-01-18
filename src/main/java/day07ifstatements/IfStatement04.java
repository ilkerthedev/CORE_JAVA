package day07ifstatements;

import java.util.Scanner;

public class IfStatement04 {

    public static void main(String[] args) {

        //Example 1: Gun sayisini verdigimizde gun ismini yazan kodu olusturunuz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun sayisini giriniz...");
        byte num =input.nextByte();

        if(num==1){
            System.out.println("Sunday");
        }else if(num ==2){
            System.out.println("Monday");
        }else if(num ==3){
            System.out.println("Tuesday");
        }else if(num ==4){
            System.out.println("Wednesday");
        }else if(num ==5){
            System.out.println("Thursday");
        }else if(num ==6){
            System.out.println("Friday");
        }else if(num ==7){
            System.out.println("Saturday");
        }else{
            System.out.println("Hatali bir giris yaptiniz. Lutfen 1 ile 7 arasinda bir sayi giriniz...");
        }



    }//main body

}//class body
