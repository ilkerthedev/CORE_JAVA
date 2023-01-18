package day21statickeyword;

public class Student {

    /*
        1)static variable veya static method'lar(class member) tum object'ler icin ortak elemandir.
        2)static class member'lar uzerinde yapilan tum degisiklikler object'leri etkiler.
        3)static class member'lar Class'a, non-static class member'lar object'lere monte edilir.
          Mesela; bir class'dan 100 tane Object olusturdugunuzda non-static olanlar 100 kere olusturulur,
          ama static olanlar object sayisindan bagimsiz olarak 1 kere olusturulur.
        4)static class member'lara ulasmak icin object olusturmaya gerek duyulmaz, ama non-static class member'lara
          ulasmak icin object olusturmak sarttir.
        5)static variable'larin diger adi "Class Variable" dir.
          Non-static Variable'larin diger adi "Instance Variable" veya "Object Variable" dir.
     */

    public static String stdName = "Tom Hanks";
    public int age = 13;

    //Ogrenci isminin ilk harflerini veren method'u olusturunuz.
    public static String getInitials (String name){

    String first = name.substring(0,1);
    String second = name.split(" ")[1].substring(0,1);

    return first+second;
    }

    //Ogrenci ismindeki sesli harfleri(a, e, i, o, u) sayan bir method olusturunuz
    public int countVowels(String name){

        int counter = 0;

        for (int i = 0; i < name.length(); i++) {

            name.toLowerCase().charAt(i);

            switch (name.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }
        }
    return counter;
    }

}//class
