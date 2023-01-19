package day28exceptions;

public class Exceptions06 {

    public static void main(String[] args) {

        String s = "Java";
        getNumberOfChars(s);

        String t = "";
        getNumberOfChars(t);

        String u = null;
        getNumberOfChars(u);//NullPointerException

    }

    //String'in degeri "null" oldugunda String Class'daki bazi method'lari kullanamayiz, kullanirsaniz Java "NullPointerException" atar.
    public static void getNumberOfChars(String s) {

        try {
            int numOfChars = s.length();
            System.out.println(numOfChars);
        } catch (NullPointerException e) {
            System.out.println("null degeri icin bazi method'lar kullanilamaz!");
        }
    }//getNumberOfChars

}//class


