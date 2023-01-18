package day14arraysforeachloop.javadev02examples;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 1, 0, 8, 9};
        System.out.println(Arrays.toString(arr));
        sortArr(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sortArr(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
