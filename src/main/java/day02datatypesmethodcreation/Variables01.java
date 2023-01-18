package day02datatypesmethodcreation;

public class Variables01 {

    //primitive data types --> char -boolean - byte - short - int - long - float - double
    //float: Virgüllü sayılar(Ondalık sayılar - Decimal Numbers) için kullanılır. (Fiyatlandırmalar - 12.99)
    //double: Virgüllü sayılar(Ondalık sayılar - Decimal Numbers) için kullanılır. (Hücre Ağırlığı: 0.0000000112)

    //Note 1: primitive data type'larını java oluşturmuştur, biz oluşturamayız.
    //Note 2: primitive data type'larının isimlerinde sadece küçük harf kullanılır.
    //Note 3: primitive data'lar data type'lara göre memoryde farklı farklı yer kaplarlar.
    //Note 4: primitive data'lar içlerinde sadece sizin atadığınız değeri barındırırlar.

    public static void main(String[] args) {

        //Ornek1: Gomlek ve ayakkabı fiyatları için 2 tane variable oluşturup toplam fiyatı ekrana yazdırınız.
        //Note: Java "Decimal Numbers" i otomatik olarak "double" kabul eder.
        //      Siz data type'ını "float" yazarsanız hata verir.
        //      float olmasında israr ediyorsanız sonuna "F" veya "f" koymalisiniz.
        //      float memoryde 4 byte yer kaplar, double 8 byte yer kaplar.

        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;

        //System.out.println() ekrana yazdırır ve "pointer" ı bir sonraki satıra koyar.
        //System.out.print() ekrana yazdırır ve "pointer" ı aynı satırda tutar.
        //System.out.println() yazdırmanın kısa yolu --> "sout" yaz ve Enter'a bas.

        System.out.println(shirtPrice + shoesPrice);

        //Ornek2: Hücre agirligi ve Amip'in ağırlığı için iki tane variable oluşturun ve ağırlıkları farkını ekrana yazdırın.

        double weightCell = 0.000000000113;
        double weightAmip = 0.000000000023;

        System.out.println(weightCell - weightAmip); //8.9E-14 ==> "8.9 çarpı 10 üzeri -14" "E ==> Exponent"

    }

}
