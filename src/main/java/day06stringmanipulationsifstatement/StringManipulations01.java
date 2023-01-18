package day06stringmanipulationsifstatement;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Bir String'in bas ve sonunda space character'i varsa siliniz.
        //           "  Ali Can  "   ==>   "Ali Can"

        String s = "   Ali Can  ";
        System.out.println(s);

        //trim() methodu bir string'in bas ve sonundaki space characterlerini siler, aradaki space'lere dokunmaz.
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //Example 2: Assagida fiyatlari verilen urunlerin toplam fiyatını bulunuz.
        //           String tv = "$456.99";  String laptop = "$875.99";  ==> 456.99 + 875.99 = 1332.98
        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$", "");
        System.out.println(tv2);

        String laptop2 = laptop1.replace("$", "");
        System.out.println(laptop2);

        double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);

        //Example 3: verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdırınız
        //            "Ali Can" ==> AC

        String t = "   ali cAN  ";

        char first = t.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char second = t.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);

        System.out.println("" + first + second);//AC

        //Example 4: Bir String'in hiç character içermedigini(Boş String) kontrol eden kodu yazınız.

        String str = "";

        //1. Yol: lenght() kullan
        boolean results1 = str.length() == 0;
        System.out.println("String boş mu? " + results1);//true

        //2. Yol: isEmpty() kullan. Java bir konuda method uretmisse o methodu kullanmak en iyisidir.
        boolean results2 = str.isEmpty();
        System.out.println("String boş mu? " + results2);//true

        //Example 5: Bir String'in space hariç hiçbir character içermedigini kontrol eden kodu yazınız.

        String r = "     ";

        //1. Yol:
        boolean result3 = r.replace(" ", "").length()==0;
        System.out.println("Sadece space mi var? "+result3);

        //2.Yol:

        boolean result4 = r.replace(" ", "").isEmpty();
        System.out.println("Sadece space mi var ? " + result4);

        //3. Yol:
        //isBlank() methodu sadece space iceren Stringler icin true verir space disinda bir character icerirse false verir.
        //isBlank() methodu bos Stringler icinde true verir.
        //isBlank() ===> space + hicbir sey icin true verir,        isEmpty ==> hicbir sey icin true verir.

        boolean result5 = r.isBlank();
        System.out.println("Sadece space mi var ? " + result5);

        //Example 6: Bir Stringde a, i, e karakterlerinin ilk görünümlerinin indexleri toplamını ekrana yazdırınız.
        //           "Java is easy to learn" ==> 1 + 5 + 8 = 14

        String r1 = "Java is easy to learn";

        int idxA = r1.indexOf('a');
        System.out.println(idxA);//1

        int idxI = r1.indexOf('i');
        System.out.println(idxI);//5

        int idxE = r1.indexOf('e');
        System.out.println(idxE);//8

        System.out.println("Indexler toplamı = " + (idxA+idxI+idxE)); //14

        //Example 7: Bir Stringde "Java" kelimesinin ilk olarak kaçıncı index'de kullanıldığını gösteren kodu yazınız.
        //           "Ah Java vah Java sensiz olmuyor Java." ==> 3
        String u = "Ah Java vah Java sensiz olmuyor Java.";

        //indexOf("Java") kullanımında siz "Java" kelimesinin ilk görünümündeki ilk harfin(J) indexini almış olursunuz.
        int idxJava = u.indexOf("Java");
        System.out.println("idxJava = " + idxJava);//3

        //indexOf() methodu olmayan characterler için kullanılırsa her zaman "-1" verir
        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz);//-1

        //Example 8: Bir String'de a,i e characterlerinin son görünümlerinin indexleri toplamını ekrana yazdırınız.
        //           "Java is easy to learn" ==> 18 + 5 + 17 = 40
        //Note: lastIndexOf() Stringde olmayan bir character icin kullanilirsa her zaman "-1" verir.

        String v = "Java is easy to learn";
        int idxLastA = v.lastIndexOf('a');//18
        int idxLastI = v.lastIndexOf('i');//5
        int idxLastE = v.lastIndexOf('e');//17
        System.out.println(idxLastA+idxLastI+idxLastE);//40

        //Example 9:Bir String'deki tekrarsiz character'leri ekrana yazdiriniz.
        //          "abbccdc" ==> ad

        String y = "aac";

        char ch1 = y.charAt(0);
        if (y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = y.charAt(1);
        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);
        if (y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

        //Note: Bazı kodların bazı şartlara bağlı olarak çalışması gerekir.
        //      Bazı kodları bazı şartlara göre aktive etmek için "if statement" kullanılır.
        //      if you study hard, you will learn Java.


        //Example 10: Sayi pozitive ise ekrana pozitive yazdirin.
        int num = 12;

        if(num>0){
            System.out.println("Pozitif");//Pozitif
        }

        //Example 11: Sayi -1 ile 10 arasında ise ekrana "rakam" yazdirin.
        int num2 = 5;

        if(num2>-1 && num2<10){
            System.out.println("Rakam");//Rakam
        }

        //Example 12: Sayi uc basamakli ise ekrana "Wooow!" yazdirin
        int num3 = -123;

        num3 = Math.abs(num3);

        if(num3>99 && num3<1000){
            System.out.println("Wooow!");//Wooow!
        }

















    }//main body

}//class body
