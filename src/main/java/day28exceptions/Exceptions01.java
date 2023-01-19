package day28exceptions;

public class Exceptions01 {

    /*
        1)"Exception" beklenmedik problem demektir. Seyahatte benzin'in bitmesi, arabanin bozulmasi gibi...
        2)Gercek hayatta karsilastigimiz beklenmedik problemler icin cozum yollarimiz vardir. Mesela benzin bitince Yol Yardim'i arariz.
          Application'larda da beklenmedik problemler icin cozum yollari uretmeliyiz, bu isleme "Exception Handling" denir.
        3)Exception'lar temel olarak ikiye ayrilirlar
          i)Compile Time Exception: Siz code yazarken farkedilir ve yazdiginiz code'un alti kirmizi cizgi ile cizilir.
         ii)Run Time Exception: Siz code yazarken farkedilmez ama code'u calistirdiginizda console'da hata alirsiniz.
        4)Expection'lar disinda "Error" diye adlandirdigimiz "Handle" edilemeyen problemler vardir.
          Gercek hayatta soforun olmesi gibi, handle edilemeyecek durumlar "Error" dur.
          Application'larda "Memory" nin dolmasi "Error" dur.
          Iki tur memory var:
          i)Stack Memory dolarsa "StackOverFlow Error" alirsiniz.
         ii)Heap Memory dolarsa "OutOfMemory Error" alirsiniz.
        5)Yazdiginiz kod calismadiginda problemi bulmak icin "Log" lara bakariz.
        6)If else kullanirsak olusabilecek her problemi spesifik olarak if parantezinin icine yazmamiz gerekir.
           Bu da ciddi bir matematik bilgisi gerektirir ve yazacagimiz kodu cok uzatir.
          Ama Try Catch'te Java ilgili Exception ile alakali olusabilecek butun problemleri yakalar.
        7)
     */

    public static void main(String[] args) {

        int a = 12;
        int b = 0;

        divide(a, b);

        divide2(a, b);
    }

    //ArithmeticException yazdiginiz code'da matematiksel islem kullaniyorsaniz alinabilecek bir Exception'dir.
    //Nasil handle edilecegini assagida yazdik.
    public static void divide(int a, int b) {

        try {

            System.out.println(a / b);

            System.out.println("I am here");

        } catch (ArithmeticException e) {

            System.out.println("Do not divide by zero");

        }

        System.out.println("You are here");

    }//divide

    //"Exception Handling" de if-else kullanilmaz. Bakiniz 6. note
    public static void divide2(int a, int b) {

        if (b == 0) {
            System.out.println("Do not divide by zero");
        } else {
            System.out.println(a / b);
        }

    }//divide 2

}//class
