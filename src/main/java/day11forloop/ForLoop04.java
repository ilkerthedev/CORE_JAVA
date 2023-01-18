package day11forloop;

public class ForLoop04 {

    public static void main(String[] args) {

        //Example 1: 5'den 8'e kadar tamsayilarin toplamini veren kodu yaziniz.
        //           5 + 6 + 7 + 8 ==> 26

        int numStart = 5;
        int numFinish = 8;
        int sum = 0;

        for (int i = numStart; i < numFinish+1 ; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        //Example 2: 7'den 9'a kadar tam sayilarinin carpimini veren kodu yaziniz.
        //           7*8*9 =504

        int m = 1;

        for (int i = 7; i <10 ; i++) {

            m = m*i;
        }
        System.out.println(m);






    }//main

}//class
