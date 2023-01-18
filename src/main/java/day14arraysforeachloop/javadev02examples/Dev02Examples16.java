package day14arraysforeachloop.javadev02examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dev02Examples16 {

    /*
 Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
 Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan sonra sürekli azalan Array.
  */

    public static void main(String[] args) {

        int[]  arr = {-999,1, 2, 5, 7, 9, 22, 8, 3, 1, -100};

        isMountainArray(arr);

    }//main

    public static void isMountainArray(int[] arr){

        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        int max = arr[0];

        for (int w:arr){
            if (w>max){
                max = w;
            }
        }

        for (int j : arr) {
            first.add(j);
            if (j == max) {
                break;
            }
        }

        for (int i = arr.length-1; i > -1 ; i--) {
            if (arr[i]==max){
                break;
            }
            second.add(arr[i]);
        }

        List<Integer> firstCopy = new ArrayList<>(first);
        List<Integer> secondCopy = new ArrayList<>(second);
        Collections.sort(firstCopy);
        Collections.sort(secondCopy);

        if (first.equals(firstCopy) && second.equals(secondCopy)){
            System.out.println("Mountain Array");
        }else System.out.println("Mountain Array degil");

    }

}//class

