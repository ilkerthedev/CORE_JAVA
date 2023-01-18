package advanced_practice.practice09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04_Manav {
    /*
        Basit bir 5 ürünlü manav alışveris programı yazınız.

    * 1. Adim : Ürün ve fiyat listesi oluştur.
    * 2. Adim : Ürün listesinden kod ile ürün seçtir ve kaç kilo olduğunu sor.
    * 3. Adim : Müşteri her ürün seçtiğinde, aldığı ürünün fiyatını toplam fiyata ekle.
    * 4. Adim : Alışveriş bitince ödemesi gereken tutarı göster.
    * 5. Adim : Başka bir ürün almak isteyip istemediğini sor.
    *         İstemiyorsa ödenecek tutarı göster, istiyorsa tekrar ürün seçtir.
    *         Bu işlemi alışveriş bitene kadar tekrarla.

    */
    static List<String> urunlistesi = new ArrayList<>();
    static double toplamOdeme;

    public static void main(String[] args) {
        urunlistesi.add("Domates - Ürün Kodu 1 - Fiyatı: 20");
        urunlistesi.add("Biber - Ürün Kodu 2 - Fiyatı: 25");
        urunlistesi.add("Patates - Ürün Kodu 3 - Fiyatı: 9");
        urunlistesi.add("Elma - Ürün Kodu 4 - Fiyatı: 15");
        urunlistesi.add("Muz - Ürün Kodu 5 - Fiyatı: 30");
        System.out.println("urunlistesi = " + urunlistesi);
        musteriSecimi();

    }


    public static void musteriSecimi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ürün kodunu giriniz");
        int kod = scanner.nextInt();
        System.out.println("Kiloyu giriniz");
        int kilo = scanner.nextInt();

        System.out.println(kilo + " kilo " + urunlistesi.get(kod - 1).split(" ")[0] + " => " + Integer.parseInt(urunlistesi.get(kod - 1).split(" ")[urunlistesi.get(kod - 1).split(" ").length - 1]) * kilo);
        toplamOdeme += Integer.parseInt(urunlistesi.get(kod - 1).split(" ")[urunlistesi.get(kod - 1).split(" ").length - 1]) * kilo;
        System.out.println("toplamOdeme = " + toplamOdeme);

        System.out.println("Alışverişe devam etmek için D, kasa için herhangi bir karakter giriniz");

        if (scanner.next().equalsIgnoreCase("d")) {
            musteriSecimi();
        } else {
            System.out.println("toplamOdeme = " + toplamOdeme);
            System.out.println("Bizi tercih ettiğiniz içi teşekkürler");
        }
    }
}