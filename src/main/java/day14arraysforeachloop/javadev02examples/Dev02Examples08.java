package day14arraysforeachloop.javadev02examples;

import java.util.Scanner;

public class Dev02Examples08 {

    public static void main(String[] args) {

        /*
         Example: Kulanicidan satir sayisini alarak asagidaki sekli yazdiriniz

               *
              * *
             *   *
            *     *
           * * * * *

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen satir sayisini giriniz...");
        int row = input.nextInt();

        System.out.println("Lutfen bir character giriniz...");
        char ch = input.next().charAt(0);

        row = Math.abs(row);
        int column = row;


        for (int i = 1; i <= column; i++) {

            for (int space = column; space > i; space--) {
                System.out.print(" ");

            }//first inner for

            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i) {
                    System.out.print(ch + " ");
                } else if (i == row) {
                    System.out.print(ch + " ");
                } else System.out.print("  ");

            }//second inner for

            System.out.println();
        }//outer for

    }//main

} //class





