package advanced_practice.practice02;

import java.util.Arrays;

public class Q03_Arrays_IkinciMax {

    /*
            Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.
            input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
            output: min:-90, max:10001, secMax: 8787
       */

    public static void main(String[] args) {
        int[] arr = {100, 10001, -90, 845, 8787, 898, 0, 1};

        //1. Yol:
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[-90, 0, 1, 100, 845, 898, 8787, 10001]
        System.out.println("min:" + arr[0] + " max:" + arr[arr.length - 1] + " secMax:" + arr[arr.length - 2]);

        //2. Yol: //{ 100, 10001, -90, 845, 8787, 898, 0, 1};

        int min = arr[0];
        int max = arr[0];
        int secMax = arr[0];

        for (int w : arr) {
            if (w < min) {
                min = w;
            } else if (w > max) {
                secMax = max;
                max = w;
            } else if (w > secMax) {
                secMax = w;
            }
        }

        System.out.println("min:"+min+" max:"+max+" secMax:"+secMax);
    }

}//class
