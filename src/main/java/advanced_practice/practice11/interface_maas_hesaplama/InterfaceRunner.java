package advanced_practice.practice11.interface_maas_hesaplama;

public class InterfaceRunner {
       /*
    Net maaş hesaplayan bir kod yazınız.(Interface kullanınız)

    Maaş kriterleri: Çalışanın toplam çalışma yılına göre her yıl için brüt maaşı 100 dolar  artır.
                     Çalışanın aylık çalışma saatine göre 160 saat üstü  her saat için brüt maaşı 10 dolar artır.
                     10 yıl ve üstü çalışma yılı bulunan çalışanların brüt maaşlarından %30, diğerlerinden %20 vergi kesintisi yap.
     */

    public static void main(String[] args) {


        MaasHesapla maasHesaplaAli = new MaasHesapla();
        System.out.println("maasHesaplaAli.neetMaas(10000,11,160) = " + maasHesaplaAli.netMaas(10000, 11, 160));

        MaasHesapla maasHesaplaVeli = new MaasHesapla();
        System.out.println("maasHesaplaVeli.neetMaas(10000,1,180) = " + maasHesaplaVeli.netMaas(10000, 1, 180));

        MaasHesapla maasHesaplaAyse = new MaasHesapla();
        System.out.println("maasHesaplaAyse.neetMaas(10000,15,180) = " + maasHesaplaAyse.netMaas(10000, 5, 180));


    }
}


