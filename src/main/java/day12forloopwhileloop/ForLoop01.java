package day12forloopwhileloop;

public class ForLoop01 {

    public static void main(String[] args) {

        /*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X
        */

        char ch = 'X';
        int row = 3;   //sutun
        int column = 5;//satir

        for (int i = 1; i <row+1 ; i++) {

            for (int j = 1; j < column+1 ; j++) {
                System.out.print(ch+" ");
            }

            System.out.println();
        }


    }//main

}//class
