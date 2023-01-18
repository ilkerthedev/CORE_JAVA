package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        /*
            Example 1:Assagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                       i)En az 8 character olsun
                       ii)Space characteri password'de olmasın
                       iii)En az bir tane büyük harf olsun
                       iv)En az bir tane küçük harf olsun
                       v)En az bir tane sembol olsun
                       vi)En az bir tane rakam olsun
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen password'unuzu giriniz...");
        String pwd = input.nextLine();

        //i)En az 8 character olsun

        boolean firstRule = pwd.length() > 7;
        System.out.println("firstRule = " + firstRule);

        //ii)Space characteri password'de olmasın
        //   normalde contains() methodu olma durumu kontrol eder, "!" not anlamına geldiği için olmama durumunu kontrol eder.

        boolean secondRule = !pwd.contains(" ");
        System.out.println("secondRule = " + secondRule);

        //iii)En az bir tane büyük harf olsun
        //Note: Buyuk harf olmayanları sil,
        //      Kalan character sayısına bak
        //      Character sayısı sıfır ise büyük harf yok, sıfırdan büyük ise büyük harf var demektir.

        boolean thirdRule = pwd.replaceAll("[^A-Z]", "").length() > 0; //Method Chain
        System.out.println("thirdRule = " + thirdRule);

        //iv)En az bir tane küçük harf olsun

        boolean fourthRule = pwd.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("fourthRule = " + fourthRule);


        //v)En az bir tane sembol olsun

        boolean fifthRule = pwd.replaceAll("[a-zA-Z0-9 ]", "").length() > 0;
        System.out.println("fifthRule = " + fifthRule);

        //vi)En az bir tane rakam olsun

        boolean sixthRule = pwd.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("sixthRule = " + sixthRule);

        System.out.println("\n******************************");
        System.out.println("Password geçerli mi? " + (firstRule && secondRule && thirdRule && fourthRule && fifthRule && sixthRule));


    }//main body

}//class body
