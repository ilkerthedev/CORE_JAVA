package advanced_practice.practice07;

import java.time.LocalDate;


public class Market {

    String urunAdi;
    Double urunFiyati;
    String sonKullanmaTarihi;

    public Market(String isim, double fiyat, int aySonra) {
        this.urunAdi = isim;
        if (fiyat>99){
            fiyat = fiyat*0.9;
        }
        this.urunFiyati = fiyat;
        this.sonKullanmaTarihi = LocalDate.now().plusMonths(aySonra).toString();
    }

    public Market(String isim, double fiyat) {
        this.urunAdi = isim;
        if (fiyat>99){
            fiyat = fiyat*0.9;
        }
        this.urunFiyati = fiyat;
        this.sonKullanmaTarihi = "Bu urunun son kullanma tarihi yoktur.";
    }

    public Market(){

    }

    @Override
    public String toString() {
        return "Market{" +
                "urunAdi='" + urunAdi + '\'' +
                ", urunFiyati=" + urunFiyati +
                ", sonKullanmaTarihi='" + sonKullanmaTarihi + '\'' +
                '}';
    }
}
