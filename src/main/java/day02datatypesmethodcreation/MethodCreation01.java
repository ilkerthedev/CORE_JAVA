package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
            Java'da method nasıl oluşturulur?

            1)main methodun dışında oluşturulur
            2)Access Modifier + Return Type + Method Name + () + {}

            Oluşturulan method'lar nasıl kullanılır?

           1)main method'un içinden kullanılır
           2)methodun ismini + () yazın
           3)İşlem yapacağınız sayıları parantezin içine koyun

     */

    public static void main(String[] args) {

        int sonuc = add(30, 50);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(3, 6);
        System.out.println(carpmaSonucu);

        long ucluSonuc = firstTwoMultiplyThirdAdd(3, 2, 10);
        System.out.println(ucluSonuc);

        double sayininKupu = getCube(4);
        System.out.println(sayininKupu);

    }

    public static int add(int a,int b){
        return a+b;
    }

    protected static long multiply(int a,int b){
        return a*b;
    }

    //Verilen 3 sayıdan ilk ikisini çarpan ve sonucu üçüncü ile toplayan methodu oluşturunuz

    private static long firstTwoMultiplyThirdAdd(int a,int b,int c){
        return (a*b)+c;

    }

    //Ornek2:Verilen bir ondalık sayının küpünü hesaplayan methodu oluşturun
    //Note: Access Modifier'ı default yapmak için access modifier'ı yazmayınız.
   static double getCube(double a){
        return a*a*a;

   }

   //1)Dikdörtgenin alanını hesaplayan methodu oluşturunuz ve kullanınız
   //2)Dikdörtgenin çevresini hesaplayan methodu oluşturunuz ve kullanınız
   //3)Dairenin çevresini hesaplayan methodu oluşturunuz ve kullanınız
   //4)Dairenin alanını hesaplayan methodu oluşturunuz ve kullanınız

}
