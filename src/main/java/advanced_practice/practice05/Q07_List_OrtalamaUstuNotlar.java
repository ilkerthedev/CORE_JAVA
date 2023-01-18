package advanced_practice.practice05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07_List_OrtalamaUstuNotlar {

    // Bir öğretmenden girmek istediği kadar notu alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    List<Double> notlar = new ArrayList<>();
    String karar;

    int counter = 0;

        do {
            counter++;
            System.out.println(counter+". notu giriniz");
            notlar.add(input.nextDouble());
            System.out.println("Cikmak icin H, yeniden not girmek için herhangi baska bir karakter giriniz");
            karar = input.next();

        }while (!karar.equalsIgnoreCase("h"));
        System.out.println("notlar = " + notlar);

        //ortalama
        double toplam = 0;
        for (double w: notlar){
            toplam+=w;
        }

        double ortalama = toplam/notlar.size();
        System.out.printf("ortalama = "+"%.2f",ortalama);
        System.out.println();

        //ortalama ustu not
        int ortalamaUstuNotSayisi = 0;
        for (double w:notlar){
            if (w>ortalama){
                ortalamaUstuNotSayisi++;
            }
        }

        System.out.println("ortalamaUstuNotSayisi = " + ortalamaUstuNotSayisi);

    }//main

}//class
