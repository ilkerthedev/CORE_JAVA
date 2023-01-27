package day33maps;

import java.util.HashMap;

public class HashMaps03 {

    public static void main(String[] args) {

        //Example 1: Size verilen bir cumlede kullanilan harflerin gorunum sayisini gosteren code u yaziniz.
        //           "Java is Java" ==> J=2, a=4, v=2, i=1, s=1

        String s ="Java is Java";
        String[] sArr = s.replaceAll("[^A-Za-z]", "").split("");
        HashMap<String,Integer> hm = new HashMap<>();

        for (String w:sArr){

            Integer value = hm.get(w);

            if (value==null){
                hm.put(w,1);
            }else {
                hm.put(w,value+1);
            }
        }
        System.out.println(hm);

    }

}
