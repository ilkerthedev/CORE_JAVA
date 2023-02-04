package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println(getSumOfAllElements(myList));
        System.out.println(getSumFromSevenToSeventh());
        System.out.println(getMultiplicationFromThreeToNine());
        System.out.println(getMultiplicationFromThreeToNine2());
        System.out.println(getFactorial(5));
        getSumOfEvensBetweenTwoInt(6,1);
        System.out.println(getSumOfDigitsBetweenTwoInts(18, 12));

    }

    //Example 1: Verilen list'teki tum sayilarin toplamini veren method'u olusturunuz.
    public static int getSumOfAllElements(List<Integer> myList){

        return myList.stream().reduce(Math::addExact).get();  //Math::addExact :Matematik Class'ina git,topla tam olarak
        //return myList.stream().reduce(Integer::sum).get();
    }

    //Example 2: 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.
    //Note: Her zaman bize verilen list ile islem yapamayabiliriz
    //      Bunun icin IntStream methodunu kullaniriz.
    //      rangeClosed(startInclusive, endInclusive) methodu bize
    //      baslangıc ve bitis degeri kapsayan degiskenlerle islem yapmamızı saglar
    //Integer class'i Math class'i kadar zengin degil ornegin multiply method'u yok, o yuzden genellikle Math class'in method'larini kullaniyoruz.
    public static int getSumFromSevenToSeventh(){
        return IntStream.
                rangeClosed(7,70).
                reduce(Math::addExact).
                getAsInt();
        //return IntStream.rangeClosed(7,70).reduce(Integer::sum).getAsInt();
    }

    //Example 3: 3'den 9' a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    public static int getMultiplicationFromThreeToNine(){
        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();//rangeClosed() ==> []
    }
    public static int getMultiplicationFromThreeToNine2(){
        return IntStream.range(3,10).reduce(Math::multiplyExact).getAsInt();//range() ==> [ )
    }

    //Example 4: Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.
    public static int getFactorial(int x){
        if (x==0){
            return 1;
        }else if (x<0){
            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;
        }else return IntStream.range(1,x).reduce(Math::multiplyExact).getAsInt();
    }

    //Example 5: Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.

    public static int getSumOfEvensBetweenTwoInt(int x, int y){
        int min = Math.min(x,y);
        int max = Math.max(x,y);
        return IntStream.range(min+1,max).filter(Utils::isNumberEven).sum();
    }

    //Example 6:Size verilen iki tamsayi arasindaki tum tamsayilarin rakamlari toplamini veren kodu yaziniz.
    // 12 ve 18 ==> 13 14 15 16 17 ==> 4+5+6+7+8=30
    public static int getSumOfDigitsBetweenTwoInts(int x, int y){
        int min = Math.min(x,y);
        int max = Math.max(x,y);
        return IntStream.range(min+1,max).map(Utils::getSumOfDigits).sum();
    }

}
