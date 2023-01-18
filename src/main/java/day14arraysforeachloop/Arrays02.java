package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz, bu elemanlarin en kucugu ile
        //           en buyugunun toplamini ekrana yazdiriniz.

        int ages[] = new int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;

        System.out.println(Arrays.toString(ages));// [20, 23, 19, 44, 15, 32]

        //1. Yol:

        //sort() method'u array'deki elemanlari kucukten buyuge siralar.
//        Arrays.sort(ages);
//
//        System.out.println(Arrays.toString(ages));// [15, 19, 20, 23, 32, 44]
//
//        System.out.println(ages[0]+ ages[ages.length-1]);//59

        //2. Yol:
        int minimum = ages[0];
        int maximum = ages[0];

                         // 20, 23, 19, 44, 15, 32
        for(int w : ages){

            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);

        }

        System.out.println(minimum + maximum);




















    }//main

}//class
