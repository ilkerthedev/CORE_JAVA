package day33maps;

import java.util.HashMap;

public class HashMaps02 {

    public static void main(String[] args) {

        //Example 1: Size verilen bir cumledeki her bir kelimenin kacar kere kullanildigini gosteren code u yaziniz.
        //           "Java is easy. Java is OOP. OOP makes Java easy." ==> Java=3, is=2, easy=2, OOP=2, makes=1


        String sentence = "Java is easy. Java is OOP. OOP makes Java easy.";
        String[] wordsArray =sentence.replaceAll("[^A-Za-z ]","").split(" ");

        //1. YOL
        HashMap<String, Integer> wordsMap = new HashMap<>();
        for (int i = 0; i < wordsArray.length; i++) {
            if (!wordsMap.containsKey(wordsArray[i])){
                wordsMap.put(wordsArray[i], 1);
            }
            else{
                wordsMap.replace(wordsArray[i], wordsMap.get(wordsArray[i]) + 1);
            }
        }
        System.out.println(wordsMap);

        //2. YOL
        HashMap<String, Integer> wordsMap2 = new HashMap<>();
        for (String w : wordsArray){
            Integer numOfOccurrence = wordsMap2.get(w);
            if (numOfOccurrence==null){
                wordsMap2.put(w,1);
            }else{
                wordsMap2.replace(w,numOfOccurrence+1);
            }
        }
        System.out.println(wordsMap2);

    }

}
