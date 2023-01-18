package advanced_practice.practice01;

import java.util.Scanner;

public class Q04_Regex_AdSoyad {

    /*
            Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
            ad ayrı soyad ayrı sekilde ekrana yazdırınız.
            Örn: "ali can"
            Ad: Ali
            Soyad: Can
       */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ad ve soyadinizi aralarinda bir bosluk olacak sekilde giriniz");
        // "\\s" bir bosluk "\\s+" bir veya birden fazla bosluk anlamina gelir.
        String adSoyad = input.nextLine().replaceAll("[^a-zA-Z ]", "").replaceAll("\\s+", " ").trim().toLowerCase();
        System.out.println("adSoyad = " + adSoyad);

        String ad = adSoyad.split(" ")[0];
        String soyAd = adSoyad.split(" ")[1];

        String adIlkHarf = ad.substring(0,1).toUpperCase();
        String soyAdIlkHarf = soyAd.substring(0,1).toUpperCase();

        String adFormatli = adIlkHarf+ad.substring(1);
        String soyAdFormatli = soyAdIlkHarf+soyAd.substring(1);

        System.out.println("adFormatli = " + adFormatli);
        System.out.println("soyAdFormatli = " + soyAdFormatli);


    }
}
