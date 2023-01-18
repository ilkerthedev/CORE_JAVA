package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {

    public static void main(String[] args) {

        //primitive:       char    - boolean - byte - short - int     - long - float - double
        //Wrapper Class: Character - Boolean - Byte - Short - Integer - Long - Float - Double
        //Wrapper Class'lar "non-primitive" dir o yüzden memoryde çok yer kaplarlar,
        //  dolayısıyla şart değilse wrapper class kullanmayı tercih etmeyiz.


        //"n" yazıp nokta koyarsanız hiç method göremezsiniz, çünkü "primitive" ler method içermez.
        int n = 12;

        //"m" yazıp nokta koyarsanız bir çok method görürsünüz, çünkü "wrapper class" lar method içerir.
        Integer m = 12;

        byte p = 23;
        Byte r = 43;

        //Example 1: short data type'inin minimum ve maximum değerlerini kod yazarak bulunuz.

        short maxShort = Short.MAX_VALUE;
        System.out.println("short'un max değeri==> " + maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println("short'un min değeri ==> " + minShort);

        //Example 2: int data type'inin minimum vdeğeri ile byte data type'inin max degirinin toplamını bulunuz.

        int minInt = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        System.out.println("islemin sonucu ==> " + (minInt + maxByte));

        //Example 3: Primitive int'i Wrapper Integer'a çeviriniz. (Autoboxing)

        int num = 22;
        Integer wrapperNum = num;

        System.out.println("\n" + wrapperNum);

        //Example 4: Wrapper Byte'ı primitive byte'a çeviriniz. (Unboxing)

        Byte k = 43;
        byte primitiveK = k;

        System.out.println(primitiveK);

        //Example 4: primitive char'ı wrapper Character'e çeviriniz.
        //           Wrapper Boolean'ı primitive boolean'a çeviriniz.

        char x = '?';
        Character xWrapper = x;

        System.out.println(xWrapper);

        //************************************

        Boolean isAlive = true;
        boolean isAlivePrimitive = isAlive;

        System.out.println(isAlivePrimitive);

        //Example 5: Size String olarak verilen iki fiyatın toplamını ekrana yazdırın

        String shirt = "2300" ;
        String shoes = "5200" ;

        //Java'da "+" sembolü iki sayı arasında kullanılırsa "toplama işlemi" olur
        //Java'da "+" sembolü iki String arasında veya bir String ve bir sayı arasında kullanılırsa "Concatenation işlemi" olur
        //Note: Concatenation işlemlerinde Java matematikteki işlem önceliği kurallarını kullanır.
        System.out.println(shirt + shoes);



        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);

        System.out.println(toplamFiyat);//7500

        //Example 6: Size String olarak verilen iki fiyatın toplamını ekrana yazdırınız.
        //**Note**: "valueOf()" methodu tüm karakterleri rakam olan String'leri sayılara çevirir.
        //          eğer "valueOf()" methodu kullanırken String'in içine rakam olmayan bir karakter koyarsanız hata alirsiniz.
        //          Bu hatayı düzeltmeyi ileride öğreneceğiz.

        String tv = "$11000";
        String radio = "$3000";

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);



    }//method body

}//class body
