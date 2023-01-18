package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop03 {

    public static void main(String[] args) {

        /*
    Example 1: Asagidaki sekli cizdiren kodu yaziniz
                * * * *
                * * *
                * *
                *
        */
        Scanner input = new Scanner(System.in);

        System.out.println("Satir(row) sayisini giriniz...");
        int row = input.nextInt();

        char ch = '*';

        for (int i = row; i > 0 ; i--) {

            for (int j = i; j > 0 ; j--) {
                System.out.print(ch+ " ");
            }
            System.out.println();
        }



    }//main

}//class
