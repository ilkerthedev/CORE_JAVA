package day05typecastingstringmanipulations;

public class StringManipulations01 {

    //String bir non-primitive data type'dır ve aynı zamanda bir class'dır

    public static void main(String[] args) {

        String s = "Java is easy";

        //Example 1: "s" String'indeki tüm character'leri buyuk harf yapınız.
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);

        //Example 2: "s" String'indeki tüm character'leri küçük harf yapınız.

        String sLower = s.toLowerCase();
        System.out.println(sLower);

        //Example 3: "s" String'indeki ilk character'i alınız.

        char sFirstCharacter = s.charAt(0);
        System.out.println(sFirstCharacter);//J

        //Example 4: "s" String'indeki ikinci ve sondan ikinci character'i alınız ve ekrana yan yana yazdırınız.

        char sSecondCharacter = s.charAt(1);
        char sLastSecondCharacter = s.charAt(10);

        //1. Yol: Aynı satırda yazdırmak için
        System.out.print(sSecondCharacter);
        System.out.println(sLastSecondCharacter);

        //2. Yol: Aynı satırda yazdırmak için
        System.out.println("" + sSecondCharacter + sLastSecondCharacter);

        //Example 5: "s" String'nde kullanılan character sayısını bulunuz.

        int sLenght = s.length();
        System.out.println(sLenght);

        //Example 6: "s" String'ndeki ilk 4 characteri alınız.

        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haricdir. [0,4)
        String firstFour = s.substring(0, 4);
        System.out.println(firstFour);

        //Example 7: "s" String'ndeki "is" kelimesini alınız.

        String sub2 = s.substring(5, 7);
        System.out.println(sub2);

        //Example 8: "s" String'ndeki "easy" kelimesini alınız.


        //Bir character'den başlayıp String'in sonuna kadar almak isterseniz ikinci index'i yazmayınız.
        //s.substring(8,12); yerine s.substring(8); yazınız.
        String sub3 = s.substring(8);
        System.out.println(sub3);

        //Example 9: "s" String'nde "money" kelimesinin var olup olmadığını kontrol ediniz.

        boolean con1 = s.contains("money");
        System.out.println(con1);//false

        /*
            ***Bir method'u öğrenirken 3 şeyi mutlaka öğrenin;
            i)Bu method ne iş yapar?
            ii)Bu method'un farklı kullanımları nasıldır?
            iii)Bu method size ne return eder?
         */

        //Example 10: "s" String'inin belli bir harfle başlayıp başlamadığını kontrol ediniz.

        boolean isBegin = s.startsWith("Java");
        System.out.println(isBegin);

        //Example 11: "s" String'inin altıncı characterden itibaren belli bir harfle başlayıp başlamadığını kontrol ediniz.

        boolean isBegin2 = s.startsWith("i", 5);
        System.out.println(isBegin2);


    }//main body

}//class body
