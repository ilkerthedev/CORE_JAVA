package advanced_practice.practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q04_Bakkal {
    /*
    Bakkal günlük gelir programı yazınız.
     -Tüm günlerin gelirlerini gösteren bir method,
     -Haftalık gelir ortalamasını gösteren bir method,
     -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelire eşit olduğunu gösteren bir method oluşturunuz.
     */

    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"));
    static List<Double> gunlukKazanclar = new ArrayList<>();
    static double haftalikKazanc = 0;

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int gun = 0;
        double kazanc = 0;

        while (gun < 7) {
            System.out.println(gunler.get(gun) + " gununun kazancini giriniz");
            kazanc = inp.nextDouble();
            haftalikKazanc += kazanc;
            gunlukKazanclar.add(kazanc);
            gun++;
        }
        System.out.println("Gunluk kazanclar: " + gunlukKazanclar);
        System.out.println("Haftalik toplam kazanc: " + haftalikKazanc);
        System.out.printf("Haftalik ortalama gelir: " + "%.2f", ortalamaGelir());
        System.out.println();
        System.out.println("Ortalama ustu gunler: " + ortalamaUstuGunler());
        System.out.println("Ortalama alti gunler: " + ortalamaAltiGunler());
    }//main

    static double ortalamaGelir() {
        return haftalikKazanc / 7;
    }

    static String ortalamaUstuGunler() {
        String ortalamaUstuGunler = "";

        for (int i = 0; i < 7; i++) {
            if (gunlukKazanclar.get(i) > ortalamaGelir()) {
                ortalamaUstuGunler += gunler.get(i) + " ";
            }
        }
        return ortalamaUstuGunler;
    }

    static String ortalamaAltiGunler() {
        String ortalamaAltiGunler = "";

        for (int i = 0; i < 7; i++) {
            if (gunlukKazanclar.get(i) < ortalamaGelir()) {
                ortalamaAltiGunler += gunler.get(i) + " ";
            }
        }
        return ortalamaAltiGunler;
    }


}//class
