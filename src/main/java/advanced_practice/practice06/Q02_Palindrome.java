package advanced_practice.practice06;

import java.util.Scanner;

public class Q02_Palindrome {

    //Bir String değerin Palindrome olup olmadığını kontrol eden bir kod yazınız.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("Bir String değer giriniz");
//        String str = input.nextLine().replaceAll(" ", "").toLowerCase();
//        String strReverse = "";
//
//        for (int i = str.length()-1; i > -1; i--) {
//
//            strReverse += str.charAt(i);
//
//        }
//        System.out.println("str = " + str);
//        System.out.println("strReverse = " + strReverse);
//
//        if (str.equals(strReverse)){
//            System.out.println("Palindrome");
//        }else System.out.println("Not Palindrome");

        System.out.println("Bir String değer giriniz");
        String str2 = input.nextLine().replaceAll(" ", "").toLowerCase();

        StringBuilder stb = new StringBuilder(str2);
        String str2Reverse = stb.reverse().toString();

        if (str2.equals(str2Reverse)){
            System.out.println("Palindrome");
        }else System.out.println("Not Palindrome");


    }

}
