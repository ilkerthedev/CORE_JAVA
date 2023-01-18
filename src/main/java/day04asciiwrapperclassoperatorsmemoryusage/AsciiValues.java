package day04asciiwrapperclassoperatorsmemoryusage;

public class AsciiValues {

    //Java da her karakterin sayısal bir değeri vardır.
    //Bu değerler ASCII Deger'ler olarak adlandırılır.
    //Bu değerlerin tamamının bulunduğu tabloya "ASCII Table" denir, globaldir.

    public static void main(String[] args) {

        //Herhangi bir character'in ASCII değerini bulmak için o karakteri "int" data type'inde bir variable'ın içine koyunuz.
        int ch = 'A';

        System.out.println(ch);

        int unlem = '!';

        System.out.println(unlem);

        char c1='K';
        char c2='?';
        //Java'da charları matematiksel işlemlerde kullanırsanız java o char'ların ASCII değerlerini kullanır.
        System.out.println(c1 + c2);// 138

    }//method body

}//class body
