package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {

    public static void main(String[] args) {

        //Example 1: Verilen bir List'teki elementleri tekrarsiz olarak yazdiriniz.
        //           [2, 3, 2, 2, 3, 5] ==> [2, 3, 5]

        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);

        List<Integer> newList = new ArrayList<>();

        for (Integer w: myList){
            if (!newList.contains(w)){
                newList.add(w);
            }
        }
        System.out.println(newList);

        //Example 2: Musteriden urun ismini aliniz.
        //           Musterinin ismini verdigi urun Listede varsa urunun ismini yazdiriniz.
        //           Musterinin ismini verdigi urun Listede yoksa "Out of stock" yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Urun arama sistemimize hosgeldiniz!...");
        System.out.println("Urun aramayi sonlandirmak icin 'Q' ya basiniz...");

        List<String> products = new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Mobile Phone");

        /*
            for loop kurunuz, products listindeki herbir elemanin tum characterlerini set method kullanarak kucuk harfe
            ceviriniz.
         */

        do {
            System.out.println("Lutfen aradginiz urun ismini giriniz...");
            String product = input.nextLine();

            if (product.equalsIgnoreCase("Q")){
                break;
            }else if (products.contains(product)){
                System.out.println(product+" is in stock...");
            }else {
                System.out.println(product + " is out of stock!...");
            }
        }while (true);

        System.out.println("Sitemizi kullandiginiz icin tesekkur eder, tekrar bekleriz...");


    }//main

}//class
