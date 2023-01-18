package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {

    public static void main(String[] args) {

        int a = 5;
        System.out.println(a);//5

        //**Increment 1:**
        a = a + 2;// veya a += 2;
        System.out.println(a);//7

        //Example 1:Bir tane integer variable olusturun ve onu iki sekilde 5 arttırın.

        int b = 10;
        System.out.println(b);//10
        b = b + 5;
        System.out.println(b);//15
        b += 5;
        System.out.println(b);//20

        //**Decrement 1:**
        int c = 8;
        System.out.println(c);//8
        c = c - 3;
        System.out.println(c);//5
        c -= 3;
        System.out.println(c);//2

        //**Increment 2:**
        int d = 6;
        System.out.println(d);//6
        d = d * 2;
        System.out.println(d);//12
        d *= 2;
        System.out.println(d);//24

        //**Decrement 2:**

        int e = 24;
        System.out.println(e);//24
        e = e / 2;
        System.out.println(e);//12
        e /= 2;
        System.out.println(e);//6

        //**"1" ile increment**
        int f = 12;

        //f = f + 1;
        //f += 1;
        f++;

        //**"1" ile decrement**
        int h = 10;

        //h = h - 1;
        //h -= 1;
        h--;
        System.out.println("*******************************************");

        //"post increment" ve "pre increment"

        int i = 10;
        int k = i++;//post increment cunku increment variable'in isminden sonra yazildi

        System.out.println(k);//10 ==> "i" arttirilmadan "k"ya konuldugu icin "k" nin degeri 10 olur.
        System.out.println(i);//11 ==> "i" satir sonunda arttirildigi icin "i" nin degeri 11 olur.


        int m =15;

        int n = ++m;//pre increment cunku icrement variable'in isminden once yazildi

        System.out.println(m);//16 ==> "m" satir sonunda arttirildigi icin "m" nin degeri 16 olur.
        System.out.println(n);//16 ==> "m" arttirildiktan sonra "n"ye konuldugu icin "n" nin degeri 16 olur.

        //"post decrement" ve "pre decrement"

        int p = 17;
        int r = p--;

        int s = 20;
        int t = --s;






































    }//main

}//class
