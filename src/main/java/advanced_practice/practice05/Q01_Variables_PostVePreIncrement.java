package advanced_practice.practice05;

public class Q01_Variables_PostVePreIncrement {

    public static void main(String[] args) {

        int x = 20;
        int y = 15;

        System.out.println(x);//20
        System.out.println(x++);//20
        System.out.println(x);//21

        System.out.println(x++ + ++y);//21 + 16 = 37
        System.out.println(x+y);// 22 + 16 = 38

        int z=5;
        System.out.println(++z + z++ + --z + z-- + z);// 6+6+6+6+5 = 29

    }//main

}//class
