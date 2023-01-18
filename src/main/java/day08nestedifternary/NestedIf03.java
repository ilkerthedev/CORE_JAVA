package day08nestedifternary;

import java.util.Scanner;

public class NestedIf03 {

    public static void main(String[] args) {

        /*
             Password'un ilk harfi buyuk harf ise
             'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
             Alemci ==> Gecerli

             Passwordun ilk harfi kucuk harf ise
             'z' olursa "gecerli passworde" yazdirin degilse "gecersiz password" yazdirin
             zehirli ==> Gecerli
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz...");
        String pwd = input.nextLine();

        char firstChar = pwd.charAt(0);

        if (firstChar >= 'A' && firstChar <= 'Z') {

            if (firstChar == 'A') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password cunku buyuk harf ama A degil...");
            }

        } else if (firstChar >= 'a' && firstChar <= 'z') {

            if (firstChar == 'z') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz password cunku kucuk harf ama \'z\' değil...");
            }

        } else {

            System.out.println("Ilk character harf olmali");

        }


    }//main body

}//class body
