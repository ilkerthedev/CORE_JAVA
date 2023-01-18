package advanced_practice.practice02;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays_ElementSil {

    /*
        Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.
        Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Kac elemanli bir array olusturmak istiyorsunuz?");
        int elemanSayisi = input.nextInt();
        Math.abs(elemanSayisi);
        int[] arr = new int[elemanSayisi];

        for(int i=0; i<arr.length; i++){

            System.out.println("Index "+i+" icin deger giriniz...");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
        System.out.println("Silmek istediginiz index'i giriniz");
        int indexSil = input.nextInt();
        int idx = 0;
        int[] arr2 = new int[elemanSayisi-1];

        for (int i= 0; i<elemanSayisi ; i++){

            if (i != indexSil){

                arr2[idx] =arr[i];
                idx++;
            }
        }

        System.out.println(Arrays.toString(arr2));




    }//main

}//class
