package day14arraysforeachloop.javadev02examples;

import java.util.Scanner;

public class Dev02Examples04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle ve bir kelime giriniz...");
        String s1 = input.nextLine();//Javas javas javas java
        String s2 = input.next();//java

        String  result = s1.indexOf(s2)>-1 ? ((s1.indexOf(s2) == s1.lastIndexOf(s2)) ? "Girilen kelime cumlede 1 kere kullanilmis"
                : "Girilen kelime cumlede 1'den fazla kere kullanilmis") : "Girilen kelime cumlede kullanilmamis";
        System.out.println(result);

    }//main

}//class
