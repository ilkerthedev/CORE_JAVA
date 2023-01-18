package day14arraysforeachloop.javadev02examples;

public class Dev02Examples13 {

    //Multi Dimensional array'in tum elemanlarinin carpimini ekrana yazdiran bir method yaziniz.
    //  { {1,2,3}, {4,5,6} }

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        multiply(arr);

    }//main

    public static void multiply(int[][] arr) {

        int sum = 1;

        for (int[] w : arr) {

            for (int k : w) {
                sum *= k;
            }
        }

        System.out.println(sum);
    }//method body


}//class
