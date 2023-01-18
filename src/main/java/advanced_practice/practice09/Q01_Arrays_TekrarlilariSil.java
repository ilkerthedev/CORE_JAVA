package advanced_practice.practice09;

import java.util.Arrays;

public class Q01_Arrays_TekrarlilariSil {

    //Bir array içerisindeki elementleri tekrarsız yazdıran bir kod yazınız.

    public static void main(String[] args) {

        StringBuilder stb = new StringBuilder();
        int[] arr = {10, 20, 20, 20, 30, 30, 40, 50, 50, 60};

        for (int w : arr) {
            if (stb.indexOf(String.valueOf(w)) < 0) {
                stb.append(w + " ");
            }
        }
        String[] arrNew = stb.toString().split(" ");
        int[] arrFinal = new int[arrNew.length];

        for (int i = 0; i < arrNew.length; i++) {
            arrFinal[i] = Integer.parseInt(arrNew[i]);
        }

        System.out.println(Arrays.toString(arrFinal));

    }
}
