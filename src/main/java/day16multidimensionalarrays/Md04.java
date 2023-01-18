package day16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {

    public static void main(String[] args) {

        //Example 1: Bir multi-dimensional array olusturunuz ve bir dimensionalli array'e donusturunuz.

        int a[][] = {{2, 5}, {3}, {4, 7, 11}};

        //"a" array'indeki toplam eleman sayisini bulunuz.

        int totalElement = 0;

        for (int[] w : a) {
            totalElement += w.length;
        }

        //"b" isimli tek dimensional'li bir array olusturunuz.
        int b[] = new int[totalElement];
        System.out.println(Arrays.toString(b));

        //"a" array'indeki elemanlari "b" array'ine transfer ediniz.
        int idx = 0;

        for (int[] w : a) {
            for (int k : w) {
                b[idx] = k;
                idx++;
            }//inner for
        }//outer for
        System.out.println(Arrays.toString(b));
    }//main
}//class
