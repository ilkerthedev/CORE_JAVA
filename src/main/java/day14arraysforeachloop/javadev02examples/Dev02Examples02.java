package day14arraysforeachloop.javadev02examples;

import java.util.Scanner;

public class Dev02Examples02 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gün ismi yazınız...");
        String s = input.next().toLowerCase();

        boolean isDayName = (s.equalsIgnoreCase("Monday") || s.equalsIgnoreCase("Tuesday") || s.equalsIgnoreCase("Wednesday") ||
                s.equalsIgnoreCase("Thursday") || s.equalsIgnoreCase("Friday") || s.equalsIgnoreCase("Saturday") || s.equalsIgnoreCase("Sunday"));

        if (isDayName) {
            String s1 = s.toUpperCase().charAt(0) + s.substring(1, 3);

            System.out.println(s1);

        } else {
            System.out.println("Lutfen gecerli bir gun giriniz...");
        }


    }//main body

}//class body

