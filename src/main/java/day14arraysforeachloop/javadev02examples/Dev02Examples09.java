package day14arraysforeachloop.javadev02examples;

import java.util.Scanner;

public class Dev02Examples09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String pass = "";

        int counter = 0;

        do {

            if (counter == 5) {
                System.out.println("Cok fazla hatali giris yaptiniz daha sonra lutfen tekrar deneyiniz...");
                break;
            }

            System.out.println("Lutfen password'unuzu giriniz...");
            pass = input.nextLine();

            boolean isEightCharacter = pass.length() > 7;
            boolean isLowerCase = pass.replaceAll("[^a-z]", "").length() > 0;
            boolean isUpperCase = pass.replaceAll("[^A-Z]", "").length() > 0;
            boolean isSpecialCharacter = pass.replaceAll("[a-zA-Z0-9]", "").length() > 0;
            boolean isSpace = pass.contains(" ");

            if (!isLowerCase) {
                System.out.println("Password en az bir kucuk harf icermelidir...");
                System.out.println("Kalan deneme hakkınız: " + (4 - counter));
            } else if (!isUpperCase) {
                System.out.println("Password en az bir buyuk harf icermelidir...");
                System.out.println("Kalan deneme hakkınız: " + (4 - counter));
            } else if (!isSpecialCharacter) {
                System.out.println("Password en az bir ozel character icermelidir...");
                System.out.println("Kalan deneme hakkınız: " + (4 - counter));
            } else if (!isEightCharacter) {
                System.out.println("Password en az 8 character olmalidir...");
                System.out.println("Kalan deneme hakkınız: " + (4 - counter));
            } else if (isSpace) {
                System.out.println("Password space characterini iceremez...");
                System.out.println("Kalan deneme hakkınız: " + (4 - counter));
            } else {
                System.out.println("Password'unuz kabul edilmistir...");
                break;
            }

            counter++;

        } while (true);


    }//main

}//class
