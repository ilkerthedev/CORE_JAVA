package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

    public static void main(String[] args) {

        /*
               Gecerli Username = "admin"
               Gecerli Password = "pwd123"
               Kullanicidan username ve pass alin.
               username ve pass dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin
               username ve pass yanlis ise 4 kere "Username ve Password'unuzu giriniz" mesaji versin
               username ve pass 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.
         */

        Scanner input = new Scanner(System.in);

        int counter = 0;

        do{
            if(counter==4){
                System.out.println("Hesabiniz bloke olmustur");
                break;
            }

            System.out.println("Lutfen username giriniz...");
            String username = input.next();

            System.out.println("Lutfen password giriniz...");
            String pass = input.next();

            if (username.equals("admin") && pass.equals("pwd123")){
                System.out.println("Hesabiniza hosgeldiniz!");
                break;
            }
            counter++;
        }while (true);

















    }//main

}//class
