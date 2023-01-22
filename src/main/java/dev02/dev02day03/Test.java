package dev02.dev02day03;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int[] brr = {2, 4};

        arr(arr);
        System.out.println(Arrays.toString(arr));//normal

        brr(brr);
        System.out.println(Arrays.toString(brr));




    }

    public static void arr(int[] arr) {

        arr[0] = 7;

        System.out.println(Arrays.toString(arr));
    }

    public static void brr(int[] arr) {

        int[] crr = new int[4];

        arr = crr;

        System.out.println(Arrays.toString(arr));
    }


}
