package day05typecastingstringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Example 1: "s" String'inin "money" ile bitip bitmediğini kontrol ediniz.

        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Example 2: "s" String'indeki "money" kelimesini "dollar" kelimesine çeviriniz.

        String s1 = s.replace("money", "dollar");
        System.out.println(s1);

        //Example 3: "s" String'indeki "earn" kelimesini "win" kelimesine çeviriniz.

        String s2 = s.replace("earn", "win");
        System.out.println(s2);//Lwin Java win money

        //Example 4: "s" String'indeki "a" harflerini "*" a çeviriniz.
        //Note1: replace() method'unda çoklu character ile çalışırsanız mecbur " kullanmalısınız.
        //       Ama tek character ile çalışırsanız " ya da ' kullanabilirsiniz.

        String s3 = s.replace("a", "*");
        System.out.println(s3);

        //Note2: Ama ya ikisi de çift tırnak olmalıdır ya da ikisi de tek tırnak olmalıdır.
        //Example 5: "s" String'indeki "n" harflerini "XXX" e çeviriniz.

        String s4 = s.replace("n", "XXX");
        System.out.println(s4);


        //Example 6: "s" String'indeki tüm "e" harflerini siliniz.
        //Note: "Hiçbir şey" char data type'ında yoktur bu yüzden replace() method'u kullanarak silme işlemi
        //      yaparsanız mutlaka "çift tırnak" kullanınız.

        String s5 = s.replace("e", "");
        System.out.println(s5);

        //***************************************************************

        String t = "Ali 13 yasindadir!...";

        //Example 7: "t" String'indeki tüm rakamları "*" a çeviriniz.
        //Note: Bir grup datayı değiştirmek için replaceAll kullanılır.
        //Bir grup data'yı ifade etmek için "Regular Expressions"(Regex) kullanırız.

        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);

        /*
                Meşhur Regexler:
                1) Tum rakamlar ==> [0-9]
                2) Tum kucuk harfler ==> [a-z]
                3) Tum buyuk harfler ==> [A-Z]
                4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
                5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
                6) Tum noktalama isaretleri ==> \\p{Punct}
                7) Tum sesli harfler ==> [AEIOUaeiou]
                   x, q, w harfleri ==> [xqw]

                8) Kucuk harflerden farklı tüm character'ler ==> [^a-z]
                9) tüm harflerden tüm character'ler ==> [^a-zA-z]

                10) Space dışındaki tüm karakterler ==> \\S , [^ ]


         */

        //Example 8: "t" String'indeki tüm rakamları ve harfleri "!" e çeviriniz.

        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);

        //Example 9: "t" String'indeki tüm sesli harfleri "?" a çeviriniz.

        String t3 = t.replaceAll("[AEIOUaeiou]", "?");
        System.out.println(t3);

        //Example 10: "t" String'indeki kucuk harfler disindaki tum character'leri "<>" ceviriniz.
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);

        //Example 11: "t" String'indeki tüm harfler disindaki tum character'leri "+" ceviriniz.

        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);

        //Example 12: "t" String'indeki spaceler disindaki tum character'leri "€" ceviriniz.

        String t6 = t.replaceAll("[^ ]", "€");
        System.out.println(t6);

        //Example 12: "t" String'indeki sesli harfler disindaki tum character'leri "&" ceviriniz.

        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);


    }//main body

}//class body
