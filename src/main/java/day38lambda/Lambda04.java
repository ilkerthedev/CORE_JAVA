package day38lambda;

import java.util.stream.IntStream;

public class Lambda04 {


    public static void main(String[] args) {


        System.out.println(birdenXeKadarToplam(10));
        System.out.println(" \n  *******");
        System.out.println(birdenXeKadarTekSayTop(5));
        System.out.println(" \n  *******");
        System.out.println(birdenSonsuzaKadarGidenTekSayilardanIlkXtanesiniTop(3));
        System.out.println(" \n  *******");
        System.out.println(ıkıdenSonsuzaKadarCiftSayIlkXTop(3));
        System.out.println(" \n  *******");
        System.out.println(besdenSonsuzaKadarKuvIlkXKuvTop(3));
        System.out.println(" \n  *******");
        System.out.println(faktoriyel(5));


    }


        //SORU1: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak), toplamını bulup return ederek yazdırınız.

    public static int birdenXeKadarToplam(int x){

        int sonuc = IntStream.range(1,x+1).sum();

        return sonuc;

    }


        //SORU2: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak),
        // tek sayıların, toplamını bulup return ederek yazdırınız.

    public static int birdenXeKadarTekSayTop(int x){

        int sonuc = IntStream.rangeClosed(1,x).filter(t->t%2!=0).sum();

        return sonuc;

    }


        //SORU3: 1'den sonsuza kadar giden Tek sayılardan,
        // ilk x tanesini toplayınız sonucu return ederek yazdırınız

    public static int birdenSonsuzaKadarGidenTekSayilardanIlkXtanesiniTop(int x){

        int sonuc = IntStream.iterate(1,t->t+2).limit(x).sum();

        return sonuc;



    }



        //SORU4: 2'den sonsuza kadar giden Çift sayılardan,
        // ilk x tanesini toplayınız sonucu return ederek yazdırınız

    public static int ıkıdenSonsuzaKadarCiftSayIlkXTop(int x){

        int sonuc = IntStream.iterate(2,t->t+2).limit(x).sum();

        return sonuc;

    }




        //SORU5: 5'den sonsuza kadar giden kuvvetlerinden
        // ilk x kuvvetinin toplamını return ederek yazdırınız


    public static int besdenSonsuzaKadarKuvIlkXKuvTop(int x){

        int sonuc = IntStream.iterate(5,t->t*5).limit(x).sum();

        return sonuc;


    }


        //SORU6: x sayisinin faktoriyelini bulunuz

    public static int faktoriyel(int x){

        int sonuc = IntStream.rangeClosed(1,x).reduce(1,(a,b)->a*b);

        return sonuc;

    }








}
