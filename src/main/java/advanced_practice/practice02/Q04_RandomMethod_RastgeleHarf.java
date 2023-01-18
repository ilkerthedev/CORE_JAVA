package advanced_practice.practice02;

public class Q04_RandomMethod_RastgeleHarf {

    /*
        Rastgele bir harf veren bir method oluşturun ve ardından methodu kullanarak aşağıdakileri yazdırınız.
            ‘A’ ve ‘a’ için “İlk Karakter” yazdırınız.
            ‘B’ ve ‘b’ için “İkinci Karakter” yazdırınız.
            ‘C’ ve ‘c’ için “Üçüncü Karakter” yazdırınız.
            ‘D’ ve ‘d’ için “Dördüncü Karakter” yazdırınız.
            Diğerleri için “Diğer Karakterleri” yazdırınız.
    */

    public static void main(String[] args) {

        String rastgeleHarf = rastgeleHarf().toLowerCase();

        switch (rastgeleHarf){

            case "a":
                System.out.println("İlk Karakter");
                break;
            case "b":
                System.out.println("İkinci Karakter");
                break;
            case "c":
                System.out.println("Üçüncü Karakter");
                break;
            case "d":
                System.out.println("Dördüncü Karakter");
                break;
            default:
                System.out.println("Diğer karakterler");
        }


        /*
                String x;
                do {
                    x = rastgeleHarf();
                    System.out.println(x);
                }while (!x.equals("z"));

        **Kritik noktalari test etmek icin kullanilabilecek bir loop**

         */


    }//main

    public static String rastgeleHarf (){

        String alfabe =  "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndex = alfabe.length();
        int rastgeleIndex =(int) (Math.random()*maxIndex);

        return alfabe.substring(rastgeleIndex, rastgeleIndex+1);

    }



}//class


