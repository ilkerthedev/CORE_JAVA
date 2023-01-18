package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    public static void main(String[] args) {

        //Example 1: Kullanici ile beraber bir array olusturunuz.

        Scanner input = new Scanner(System.in);

        System.out.println("Kac ogrenci ismi gireceksiniz?");
        int numOfElements = input.nextInt();

        System.out.println("Girisi sonlandirmak icin Q tusuna basiniz... ");

        String[] stdNames = new String[numOfElements];

        for (int i = 0; i < numOfElements; i++) {

            System.out.println("Lutfen " + (i + 1) + ". ogrencinin adini giriniz.");
            String stdName = input.next();

            if (stdName.equalsIgnoreCase("Q")){
                break;
            }

            stdNames[i] = stdName;

        }

        System.out.println(Arrays.toString(stdNames));


    }//main

}//class

//hocam neden i=0 ; i<numOfElements yapip souta (i+1) yapmadik?