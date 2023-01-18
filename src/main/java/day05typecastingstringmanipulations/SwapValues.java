package day05typecastingstringmanipulations;

public class SwapValues {

    //Swap: Yer değiştirmek. 1. Kap: Patates 2. Kap:Domates ===> Swap ===> 1. kap:Domates 2.kap:Patates

    public static void main(String[] args) {

        int a = 12;
        int b = 5; //Swap'ten sonra ===> a=5 ve b=12
        int temp = 0;

        System.out.println( "a: " +a );
        System.out.println( "b: " + b);

        //*****1. YOL*****
        //I. Adım
        temp = a;

        //II. Adım
        a = b;

        //III. Adım
        b = temp;

        System.out.println( "a: " +a );
        System.out.println( "b: " + b);

        //**********2. YOL********** (Interwiev)

        int x= 12;
        int y=5;

        System.out.println("\n*********************");//console görüntüsü için
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("\n*********************");//console görüntüsü için
        System.out.println("x = " + x);
        System.out.println("y = " + y);
























    }//main body

}//class body
