package advanced_practice.practice10.okul;

import java.util.Scanner;

public class OkulMain {
     /*
    1- Değişkenleri ad, soyad, yaş olan bir Ogrenci pojo class'ı oluşturunuz.

    2- Değişkenleri okulAd, maxOgrenciSayisi, ArrayList cinsinden Öğrencileri olan bir Okul pojo class oluşturunuz

    3- Main metodunun olduğu OkulMain isimli bir class oluşturunuz.

    4- Bir okul objesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci ekleyiniz.
       Fakat oluşturacağınız öğrencilerin yaşı 15'i geçmemeli, 8'den küçük olmamalı.
       Bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Okul okul = new Okul();
        System.out.println("Okul adını giriniz");
        okul.setOkulAdi(scanner.nextLine());
        System.out.println("Maksimum öğreci sayısını giriniz");
        okul.setMaxOgrenciSayisi(scanner.nextInt());


        for (int i = 1; i <= okul.getMaxOgrenciSayisi(); i++) {

            scanner.nextLine();//dummy
            Ogrenci ogrenci = new Ogrenci();
            System.out.println(i + ". öğrenci ad: ");
            ogrenci.setAd(scanner.nextLine());
            System.out.println(i + ". öğrenci soyad: ");
            ogrenci.setSoyAd(scanner.nextLine());
            System.out.println(i + ". öğrenci yaş: ");
            try {
                ogrenci.setYas(scanner.nextInt());
                if (ogrenci.getYas() < 8 || ogrenci.getYas() > 15) {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Yas 8 ile 15 araliginda olmalidir");
                i--;
                continue;
            } catch (Exception e) {
                System.out.println("8-15 araliginda bir tamsayi giriniz");
                i--;
                continue;
            }

            okul.addOgrenciToList(ogrenci);

        }

        System.out.println(okul);

    }
}