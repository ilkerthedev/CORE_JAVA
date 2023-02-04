package day36lambda;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Lambda01 {
    public static void main(String[] args) {
        List<Double>myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);
        myList.add(26.8);
        List<Double>half = getHalfOfElementsGraterThanFiveDistinctReversed(myList);
        System.out.println(half);//[19.2, 13.4, 6.0, 3.5]
        List<String>list = new ArrayList<>();
        list.add("Tom");
        list.add("John");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");
        printAllAlphabeticallyUpperDistinct(list);//AJDA ANGELİNA BRAD CUNEYT JOHN TOM
        System.out.println();
        printAllAlphabeticallyLowerDistinct(list);//tom john cuneyt brad angelina ajda
        System.out.println();
        printAllSortWithLengthUpperDistinct(list);//TOM JOHN AJDA BRAD CUNEYT ANGELİNA
        System.out.println();
        printAllSortWithLastCharUpperDistinct1(list);//AJDA ANGELİNA BRAD TOM JOHN CUNEYT
        System.out.println();
        printAllSortWithLastCharUpperDistinct2(list);//CUNEYT JOHN TOM BRAD AJDA ANGELİNA
        System.out.println();
        printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(list);
        System.out.println();
        //System.out.println(removeElementIfTheLengthGreaterThanFive(list));//[Tom, John, Ajda, Tom, Brad]
        System.out.println();
        // System.out.println(removeElementIfStartsWithAorEndsWithd(list));//[Tom, John, Tom, Cuneyt]
        System.out.println();
        System.out.println(printLengthSquare(list));//[9, 16, 16, 64, 9, 16, 36]
        System.out.println();
        System.out.println(printElementsLengthEven(list));//[John, Ajda, Angelina, Brad, Cuneyt]
    }
    //Example 1: Create a method to find the half of the elements greater than 5, distinct, in reverse order, in a list.
    public static List<Double>getHalfOfElementsGraterThanFiveDistinctReversed(List<Double>myList){
        return myList.stream().distinct().filter(t->t>5).map(t->t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
    //Example 2: Tum list elemanlarini buyuk harfle alfabetik sirada tekrarsiz olarak yazdiriniz
    public static void printAllAlphabeticallyUpperDistinct(List<String>list){
        list.stream().distinct().map(t->t.toUpperCase()).sorted().forEach(t-> System.out.print(t + " "));
    }
    //Example 3: Tum list elemanlarini kucuk harfle alfabetik siranin tersinde ve tekrarsiz olarak yazdiriniz
    public static void printAllAlphabeticallyLowerDistinct(List<String>list){
        list.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t + " "));
    }
    //Example 4: Tum list elemanlarini buyuk harfle, uzunluklarina artan sirada, tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLengthUpperDistinct(List<String>list){
        list.stream().distinct().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.print(t + " "));
    }
    //Example 5: Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada, tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLastCharUpperDistinct1(List<String>list){
        list.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                //t->t.charAt(t.length()-1 bu ifade "lambda expression" olarak adlandirilir.
                        forEach(t-> System.out.print(t + " "));
    }
    public static void printAllSortWithLastCharUpperDistinct2(List<String>list){
        list.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(Utils::getLastChar).
                        reversed()).
                forEach(Utils::printInTheSameLineWithSpace);
    }
    //Example 6: Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada, tekrarsiz olarak yazdiriniz
    //           Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    // "method reference" class'in icindeki methodu adresle demek
    public static void printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(List<String>list){
        list.
                stream().
                distinct().
                map(String::toUpperCase).//String::toUpperCase yapisina "method reference" denir.
                sorted(Comparator.comparing(String::length).
                thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);
    }
    //Example 7: Karakter sayisi 5 den fazla olan elemanlari siliniz ve sonucu list olarak yazdiriniz
    //  public static List<String>removeElementIfTheLengthGreaterThanFive(List<String>list){
    //      list.removeIf(t->t.length()>5);
    //      return list;
    //  }
    //Example 8: "A" ile baslayan veya "d" ile biten elemanlari siliniz
    //  public static List<String>removeElementIfStartsWithAorEndsWithd(List<String>list){
    //     list.removeIf(t->t.startsWith("A") || t.endsWith("d"));
    //Bazen "stream()" methodu bize lazim olan method'lara ulasmamiza engel olur bu yuzden
    //stream() methodunu kullanmayiz. "removeIf()" methodunda oldugu gibi.
    //Fakat stream() methodu daha sonradan kullanmamiz gerekebilir. Bu durumda stream() methodunu
    // kullanarak istedigimiz method'lara ulasiriz, distinct() method'una ulastigimiz gibi.
    //Sonuc bize list olarak lazim ise "collect(Collectors.toList())" ile sonucu list'e ceviririz.
    //    return list.stream().distinct().collect(Collectors.toList());
    //  }
    //Example 9:List elemanlarini karakter sayilarinin karelerini aliniz ve bir list olarak ekrana yazdiriniz
    public static List<Integer>printLengthSquare(List<String>list){
        return list.stream().map(Utils::getLengthSquare).collect(Collectors.toList());
    }
    //Example 10: List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz
    public static List<String>printElementsLengthEven(List<String>list){
        return list.stream().filter(Utils::isLenghtEven).collect(Collectors.toList());
    }
}