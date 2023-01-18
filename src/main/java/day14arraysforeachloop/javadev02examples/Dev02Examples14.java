package day14arraysforeachloop.javadev02examples;

public class Dev02Examples14 {

    public static void main(String[] args) {

        /*
        Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
        ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
         */

        int arr[][] = {{1, 2, 3, 5, 10, 2}, {4, 5, 20, 2, 4}, {6, 10, 6, 5, 3}};

        int multiply = 1;

        for (int i = 0; i < arr.length; i++) {
            multiply *= arr[i][arr[i].length - 1];
        }
        System.out.println(multiply);

    }//main

}//class
