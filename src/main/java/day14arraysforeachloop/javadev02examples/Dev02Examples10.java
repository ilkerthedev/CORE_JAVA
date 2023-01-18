package day14arraysforeachloop.javadev02examples;

public class Dev02Examples10 {

    public static void main(String[] args) {

        //int arr[]={4, 6, 5, -10, 8, 5, 20} ==> 10
        //Ornegin   4+6=10, 5+5=10, -10+20=10

        int arr[]={4, 6, 5, -10, 8, 5, 20};

        for (int i = 0; i < arr.length; i ++) {

            for (int k = i+1; k < arr.length; k++) {

                if ((arr[i]+arr[k]) == 10){
                    System.out.println(arr[i]+"+"+arr[k]+"="+(arr[i]+arr[k]));
                }

            }//inner for

        }//outer for

    }//main

}//class
