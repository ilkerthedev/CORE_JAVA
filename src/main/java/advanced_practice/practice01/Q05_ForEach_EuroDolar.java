package advanced_practice.practice01;

import java.util.Arrays;

public class Q05_ForEach_EuroDolar {

    /*
        Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarını bulan bir kod yazınız.
        Örnek:
        String str ="$1 $12 €34 €56 $45 €78";
        dolarToplami: 58
        euroToplami: 168
    */

    public static void main(String[] args) {

        String str ="$1 $12 €34 €56 $45 €78";

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));// [$1, $12, €34, €56, $45, €78]

        int totalDollar = 0;
        int totalEuro = 0;

        for(String w: arr){

            if (w.contains("$")){
                totalDollar += Integer.parseInt(w.replaceAll("\\D", ""));
            }else {
                totalEuro += Integer.parseInt(w.replaceAll("\\D", ""));
            }
        }//for each

        System.out.println("totalDollar = " + totalDollar);
        System.out.println("totalEuro = " + totalEuro);

    }//main


}//class
