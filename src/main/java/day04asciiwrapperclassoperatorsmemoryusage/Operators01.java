package day04asciiwrapperclassoperatorsmemoryusage;

public class Operators01 {

    /*
        1) +, -, *, / işlemlerini Java da matematikte kullanıldığı gibi kullanılır.
        Note 1: int / int ==> int olur
        Note 2: double / int ==> double olur. Çünkü; Java'da matematiksel işlemlerde farklı data type'ları kullanılırsa
                sonuç büyük data type'ında olur

        2) Java'da "logical operator" lar vardır.
        AND ve OR işlemleri "logical operator" lardır.
               i) AND işleminden true alabilmek için her şey true olmalıdır.
                  AND işlemi "perfectionist" tir.
                  AND işleminde bir tane false sonucu false yapar.
                  AND sembolü " & "

              ii) OR işleminde bir tane true sonucu true yapmaya yeter.(|| or symbol)
                  OR işleminde sonucun false olması için her şey false olmalıdır.
                  OR işlemi "polyanna" gibidir.
                  OR sembolü " || "

            iii)  NOT Operatoru(!) true olanı false, false olanı true yapar.
                  !true = false
                  !false = true
                  !!true = true

        3)Comparison (Karşılaştırma) Operators
                <, >, <=, >=, ==, !=,

          Note: Karşılaştırma operatörlerini kullandığınızda kesinlikle boolean(true veya false) alırsınız.


        Note:Niz AND işlemi için "&&" kullanırız ama "&" kullanım da geçerlidir.
             Farkları nedir ?
             "&&" kullanımı ilk ifade false olduğunda diğerlerini kontrol etmez dolayısıyla hızlı çalışır
             "&" kullanımı ilk ifade ne olursa olsun diğerlerini kontrol eder dolayısıyla yavaş çalışır
             Bu yüzden biz hep "&&" ifadesini kullanırız.
     */

    public static void main(String[] args) {

        boolean first = 3<5;
        boolean second = 2+3 != 5;
        boolean third = 2+3*5 >= 19;

        System.out.println(first + " - " + second);

        System.out.println(first && second);

        System.out.println(first || second || third);

    }//method body

}//class body
