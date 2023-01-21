package advanced_practice.practice10;

import java.util.Objects;

public class Q02_Arrays_HarfKullanimSayilari {
    /*
  Girilen String'de hangi harfin kaç kere kullanıldığını yazan bir kod yazınız.
  Input: String str = "Java is so Good";
  Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
   */

    public static void main(String[] args) {

        String str = "Java is so Good";

        String[] arr = str.split("");
        int kullanimSayisi;
        StringBuilder stb = new StringBuilder();

        for (String w:arr){
            kullanimSayisi=0;
            for (String u:arr){

                if (w.equals(u)){
                    kullanimSayisi++;
                }
            }
            if (!stb.toString().contains(w)){
                stb.append(w+kullanimSayisi+" ");
            }
        }
        System.out.println(stb);
    }

}
