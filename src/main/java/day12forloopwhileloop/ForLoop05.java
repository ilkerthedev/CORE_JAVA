package day12forloopwhileloop;

public class ForLoop05 {

    public static void main(String[] args) {

        //Hic sayi kullanmadan 1 den 100e kadar olan sayilari

        for (int i = 'd'/'d'; i <'e' ; i++) {
            System.out.print(i+" ");
        }

        //Note: Bazi loop'lar hic calismayabilir
        for (int i = 1; i < 0 ; i--) {
            System.out.println(1);
        }

        //Note 2: Bazi loop'lar sonsuz defa calisabilir
        //        Bu tarz loop'lara "Infinite Loop" denir.
        //        "Infinite Loop" genellikle "increment/decrement" kisminda yapilan hatadan kaynaklanir.

//      for (int i = 1; i < 10 ; i--) {
//          System.out.println("Java is money...");
//      }

        //Note 3: Baska bir "Infinite Loop"
        //        Loop olusturdugunuzda "ikinci kismi" yazmazsaniz "Infinite Loop" olur.

//        for(int i=1;  ;i++){
//            System.out.println("Hi!");
//        }




























    }//main

}//class
