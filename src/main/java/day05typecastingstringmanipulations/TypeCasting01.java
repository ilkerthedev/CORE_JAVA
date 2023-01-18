package day05typecastingstringmanipulations;

public class TypeCasting01 {

    /*
        Numeric primitive data type'larının birbirine dönüştürülmesine "Type Casting" denir.
        Numeric(Sayısal) Data Types; byte - short - int - long - float - double

        Note 1: Küçük data type'larını büyük data type'larına çevirmeyi java otomatik olarak yapabilir.
            **  Bu işleme "AutoWidening(Otomatik genişletme)" denir.

        Note 2: Büyük data typle'larını küçük data type'larına çevirmek riskli bir iştir, Java bu risli işi
                otomatik olarak yapmaz. Bu işlemi kod yazanlar yapar.
                Bu işleme "ExplicitNarrowing(Açıktan daraltma)" denir.
     */

    public static void main(String[] args) {

        //byte data type'ını int data type'ina çeviriniz.
        byte age = 13;
        int ageInt = age;

        //long data type'ını short data type'ına çeviriniz.
        long weight = 234;

        short weightShort = (short)weight;//Expilicit Narrowing

        //int data type'ını float data type'ına çeviriniz.

        int population = 700000;
        System.out.println(population);

       float populationFloat = population;
        System.out.println(populationFloat);

        //double data type'ını short data type'ına çeviriniz.

        double num = 32.56;
        System.out.println(num);//32.56

        short numShort = (short)num;
        System.out.println(numShort);//32

        //Dikkat!
        //Dönüşüm yaptığınız sayı(260), dönüştüreceğiniz data type'ının sınırları dışında ise "%(mod)" işlemi yapar.
        //Mod işleminin sonucu sizin yeni değeriniz olur.
        //Example 1:
        short number = 260;
        System.out.println(number);//260

        byte numberByte = (byte)num;//4
        System.out.println(numberByte);

        //Example 2:
        short n = 1023;
        System.out.println(n);//1023

        byte nByte = (byte)n;
        System.out.println(nByte);//-1

    }//main body

}//class body















