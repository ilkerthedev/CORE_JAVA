package day14arraysforeachloop.javadev02examples;

import java.util.Scanner;

public class Dev02Examples01 {

    public static void main(String[] args) {

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun isimlerinin birinin ilk harfini yaziniz...\nExample: S, T ,W, F, M");
        char ch = input.next().charAt(0);

        if(ch=='S' || ch=='s' ){
            System.out.println("Sunday\nSaturday");
        }else if(ch=='T' || ch=='t'){
            System.out.println("Tuesday\nThursday");
        }else if(ch=='W' || ch=='w'){
            System.out.println("Wednesday");
        }else if(ch=='F' || ch=='f'){
            System.out.println("Friday");
        }else if(ch=='M' || ch=='m'){
            System.out.println("Monday");
        }else{
            System.out.println("Lutfen gecerli bir gunun ilk harfini giriniz...\nExample:S, T, W, F, M");
        }

         */

        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen haftanın günlerinden birini giriniz...");
        String s = input.next();

        if(s.equalsIgnoreCase("pazartesi")||
                s.equalsIgnoreCase("sali") ||
                s.equalsIgnoreCase("carsamba") ||
                s.equalsIgnoreCase("persembe") ||
                s.equalsIgnoreCase("cuma")){
            System.out.println("Hafta ici");
        }else if(s.equalsIgnoreCase("cumartesi") || s.equalsIgnoreCase("pazar")){
            System.out.println("Hafta sonu");
        }else{
            System.out.println("Lutfen geçerli bir gün giriniz...");
        }


    }//main body

}//class body
