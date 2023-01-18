package day14arraysforeachloop.javadev02examples;

public class Dev02Examples15 {

//    Asagidaki multi dimensional array'lerin ic array'lerinde ayni index’e sahip
//    elemanlarin toplamini ekrana yazdiran bir program yaziniz.
//       arrl = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

    public static void main(String[] args) {

        int[][] arr = {{1, 2}, {3, 4, 5}, {6}};
        int[][] brr = {{7, 8, 9}, {10, 11}, {12}};

        int sum = 0;

        int outerLenght = Math.min(arr.length, brr.length);

        for (int i = 0; i < outerLenght; i++) {

            int innerLenght = Math.min(arr[i].length, brr[i].length);

            for (int k = 0; k < innerLenght; k++) {

                System.out.println("arr[" + i + "]" + "[" + k + "]" + "brr[" + i + "]" + "[" + k + "]" + "= " + (arr[i][k] + brr[i][k]));

            }

        }


    }//main

}//class
