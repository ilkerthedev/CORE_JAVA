package advanced_practice.practice05;

import java.util.Scanner;

public class Q03_ForLoop_TersUcgenSayi {

    /*
        Şekli Yazdırınız:
          1 2 3 4 5 6
           2 3 4 5 6
            3 4 5 6
             4 5 6
              5 6
               6
    */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sekli olusturmak icin bir pozitif tamsayi giriniz");
        int num = input.nextInt();



        for (int i = 1; i <= num; i++) {//satir
            for (int k = 1; k < i ; k++) {//space
                System.out.print(" ");
            }
            for (int j = i; j <= num; j++) {//sutun
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }//main

}//class
