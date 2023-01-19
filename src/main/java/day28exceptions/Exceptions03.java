package day28exceptions;

public class Exceptions03 {

    public static void main(String[] args) {

        String s = "Java";

        getCharFromString(s,2);

        getCharFromString(s,4);

    }

    //String'lerde var olmayan index'ler kullanilgidinda Java "StringIndexOutOfBoundsException" atar.
    public static void getCharFromString(String s, int idx){
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullanma hatasi yaptiniz! " + e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }

    }//getCharFromString

}//class
