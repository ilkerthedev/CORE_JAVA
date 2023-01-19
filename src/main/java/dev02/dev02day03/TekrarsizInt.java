package dev02.dev02day03;

public class TekrarsizInt {

    public static void main(String[] args) {

        int a = 223878;

        String nums = String.valueOf(a);

        String tekrarsiz = "";

        for (int i = 0; i < nums.length()  ; i++) {

           String bos = nums.substring(i,i+1);

           if (nums.indexOf(bos) == nums.lastIndexOf(bos)){
               if (!tekrarsiz.contains(bos)){
                   tekrarsiz += bos;
               }
           }
        }
        System.out.println(tekrarsiz);

    }

}
