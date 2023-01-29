package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    /*
        1)Lambda "Functional programming" dir, digeri "Structured Programming"
        2)"Functional programming" "Ne yapmak gerekir?(What to do?)" ile ilgilenir "Nasil yapmak gerekir?(How to do?)" ile ilgilenmez.
        3)"Functional programming" Collection'lar ve Array'lerde kullanilir.
        4)Lambda, Java'ya "Java 8"de eklendi.
        5)"Functional programming" hizli ve hatasiz calisir.

        "stream()" elemanlari yukardan asagiya dizer."Lambda" list'i "stream" e cevirir öyle calisir.
        "filter()" filtrelemek icin kullanilir.
        "map()" u var olan elemani degistirmek icin kullanilir.
        "distinct()" u tekrarli elemanlari sadece bir kere gosterir ve tekrarsizlari olduklari kadar gosterir.
         Note : Distinct methodu ilk baslara konulursa "Lambda" ya daha az is yaptirmis oluruz.
        "reduce()" u  kullanildiginda cok sayidaki deger bir tane degere donusmus olur.
         Orn; reduce(0,(t,u)->t+u) ==> "t" ilk degeri "sifir" dan alir, daha sonraki degerleri toplamanin sonucundan alir.
         "u" ise degerlerini her zaman "stream" den alir. "u" ise degerlerini her zaman "stream" den alir .
    */

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);



        printElements1(nums);
        System.out.println();
        printElements2(nums);
        System.out.println();
        printEvenElement1(nums);
        System.out.println();
        printEvenElement2(nums);
        System.out.println();
        printSquareOfOddElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(nums);
        //--
        printProductOfSquareOfDistinctEvenElements(nums);
        //-
        getMaxValue1(nums);
        //--
        getMaxValue2(nums);
        //-
        getMaxValue3(nums);
        //-Min-
        getMinValue1(nums);
        //--
        getMinValue2(nums);
        //--
        getMinValue3(nums);
        //--
        getMinValue4(nums);
        //--new exp
        getMinGreaterThanSevenEven(nums);

    }

    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void printElements1(List<Integer> nums){
        for(Integer w : nums){
            System.out.print(w + " ");
        }
    }

    //2)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Functional)
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printElements2(List<Integer> nums){
        //12 9 131 14 9 10 4 12 15
        nums.stream().forEach(t -> System.out.print(t + " "));
    }

    //3)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void printEvenElement1(List<Integer> nums){

        for (Integer w:nums){
            if (w%2==0){
                System.out.print(w+" ");
            }
        }
    }

    //4)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Functional)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printEvenElement2(List<Integer> nums){

        nums.
                stream().
                filter(t->t%2==0).
                forEach(t-> System.out.print(t+" "));
    }

    //5)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
    //Bir list'teki tek sayi olan elemanlarin karelerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printSquareOfOddElements(List<Integer> nums){

        nums.
                stream().
                filter(t->t%2!=0).
                map(t->Math.pow(t,2)). //map() methodu varolan elemani almak icin kullanilir
                forEach(t-> System.out.print(t+" "));

    }

    //6)Create a method to print the "cube" of "distinct" "odd" list elements on the console in the same line with a space between two consecutive elements.
    //Bir list'teki "tek sayi" olan elemanlarin "kup"lerini tekrarsiz olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printCubeOfDistinctOddElements(List<Integer> nums){

        nums.
                stream(). //list to stream
                distinct(). //tekrarsizlari alir
                filter(t->t%2!=0). //tek sayilari alir
                map(t->Math.pow(t,3)). //kuplerini alir
                forEach(t-> System.out.print(t+" ")); //yazdirir.

    }

    //7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums){

        Integer sum =nums.
                stream(). //list to stream
                distinct(). //tekrarsizlari alir
                filter(t->t%2==0). //cift sayilari alir
                map(t->(int)Math.pow(t,2)). //kuplerini alir
                reduce(0,(t, u)->t+u); //coklu degerleri azaltir

        System.out.println(sum);

    }

    //8)Create a method to calculate the "product" of the "cubes" of "distinct" "even" elements

    public static void printProductOfSquareOfDistinctEvenElements(List<Integer> nums){

        Integer multiply = nums.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->(int)Math.pow(t,2)).
                reduce(1,(t,u)->t*u);

        System.out.println(multiply);

    }

    //9)Create a method to find the "maximum value" from the list elements

    //1.YOL
    public static void getMaxValue1(List<Integer> nums){

        System.out.println(nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u));

    }

    //2.YOL
    public static void getMaxValue2(List<Integer> nums){

        System.out.println(nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u));

    }

    //3.YOL
    public static void getMaxValue3(List<Integer> nums){

        Integer max = nums.stream().distinct().sorted().reduce((t,u)->u).get();
        System.out.println(max);
    }

    //10)Create a method to find the minimum value from the list elements

    //1.YOL
    public static void getMinValue1(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce((t,u)->t>u ? u : t).get();
        System.out.println(min);
    }
    //2. YOL
    public static void getMinValue2(List<Integer> nums) {
        Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t, u) -> u).get();
        System.out.println(min);
    }
    //3.YOL
    public static void getMinValue3(List<Integer> nums){
        Integer min = nums.stream().distinct().sorted().reduce((t,u)->t).get();
        System.out.println(min);
    }
    //4.YOL
    public static void getMinValue4(List<Integer> nums){
        Integer min = nums.stream().distinct().reduce((t,u)->Math.min(t,u)).get();
        System.out.println(min);
    }

    //11)Create a method to find the minimum value which is greater than 7 and even from the list
    //   12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi

    public static void getMinGreaterThanSevenEven(List<Integer> nums){
        Integer result=nums.stream().distinct().filter(t->t%2==0 && t>7).sorted().reduce((t,u)->t).get();
        System.out.println(result);
    }

}