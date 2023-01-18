package advanced_practice.practice03;

import java.util.Scanner;

public class Q03_DoWhile_TahminOyunu {

    //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
    //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("0-100 arasi(dahil) bir tam sayi giriniz.");

        int rastgeleNumara = (int) (Math.random() * 101);
        int num;
        int sayac = 10;

        do {
            sayac--;
            num = input.nextInt();

            if (num < rastgeleNumara) {
                System.out.println(sayac + " Hakkiniz kaldi.");
                System.out.println("Daha buyuk bir sayi giriniz");
            } else if (num > rastgeleNumara) {
                System.out.println(sayac + " Hakkiniz kaldi.");
                System.out.println("Daha kucuk bir sayi giriniz");
            } else if (num == rastgeleNumara) {
                System.out.println("Tebrikler!!! " + (10 - sayac) + " tahminde sayiyi buldunuz. Puaniniz: " + (sayac + 1) * 10);
                break;
            } else if (sayac == 0) {
                System.out.println("Hakkınız bitti");
                //HOMEWORK: Yeniden oynama hakkkı...
                break;
            }

        } while (true);


    }//main

}//class
