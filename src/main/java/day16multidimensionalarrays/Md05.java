package day16multidimensionalarrays;

public class Md05 {

    public static void main(String[] args) {

        //Example 1:Bir integer multi-dimensional array olusturunuz.
        //          Bu array'deki tum elemanlarin carpimini console'a yazdiran code'u yaziniz...

        int a[][] = {{5, 4}, {2, 1}};

        int total = 1;

        for (int[] w: a){
            for (int k: w){
                total *= k;
            }
        }
        System.out.println(total);

    }//main
}//class
