package advanced_practice.practice12;

import java.util.Random;

public class Q04_Random_AdOlusturma {

    //Rastgele alınan harfleri bir Stringe ekleyerek adınızı
    // ve bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.

    public static void main(String[] args) {
        String alphabet = "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ ";
        String name = "ilker";
        int idx = 0;
        int counter = 0;
        String result = "";
        while (true) {
            counter++;
            int random = (int) (Math.random()*alphabet.length());
            char randomChar = alphabet.charAt(random);
            if (randomChar == name.charAt(idx)) {
                result += randomChar;
                idx++;
                System.out.println(randomChar+": "+counter+". denemede bulundu.");
            }
            if (name.equals(result)) {
                break;
            }
        }
        System.out.println("counter = " + counter);
    }

}
