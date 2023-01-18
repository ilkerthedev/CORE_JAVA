package day11forloop;

public class ForLoop03 {

    public static void main(String[] args) {

        //Example 1: Size verilen bir String'i tersten yazdiriniz.
        //           "Germany" ==> ynamreG

        String s = "Germany";
        String t = "";

        for (int i = s.length()-1; i > -1; i--) {
            t = t + s.charAt(i);
        }
        System.out.println(t);

        //Example 2: Size verilen bir String'in "Palindrome" olup olmadigini kontrol eden kodu yaziniz...
        //              civic, nalan, kucuk, 11211 ==> Palindrome

        //Logic: String'i ters cevir sonra da duz hali ile ters halini karsilastir,ayni ise "Palindrome" de.
        String r = "Civic";
        String p = "";

        for (int i = r.length()-1; i > -1; i--) {
            p = p + r.charAt(i);
        }
        if(r.equalsIgnoreCase(p)){
            System.out.println(r+" : Palindromdur");
        }else System.out.println(r+" : Palindrom degildir");

        //StringBuilder ile ters yazdirma.

        String s2 = "Hello World!";
        StringBuilder input = new StringBuilder();
        input.append(s2);
        input = input.reverse();
        System.out.println(input);








    }//main

}//class
