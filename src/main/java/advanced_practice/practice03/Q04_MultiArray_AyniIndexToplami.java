package advanced_practice.practice03;

public class Q04_MultiArray_AyniIndexToplami {

    /*
        Aşağıdaki multi dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
        toplamını yazdıran bir program yazın.
        arr1[]={{1,2},{3,4,5}{6}}
        arr2[]={{7,8,9},{10,11},{12}}
     */

    public static void main(String[] args) {

        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

        multiArrayTotal(arr1, arr2);


    }//main

    public static void multiArrayTotal(int[][] arr1,int[][] arr2 ){

        int toplam;
        int minArrayOut = Math.min(arr1.length, arr2.length);

        for (int i = 0; i <minArrayOut ; i++) {
            int minArrayIn = Math.min(arr1[i].length, arr2[i].length);

            for (int k = 0; k < minArrayIn ; k++) {
                toplam = arr1[i][k] + arr2[i][k];
                System.out.println("arr1["+i+"]["+k+"] + arr2["+i+"]["+k+"] = "+(arr1[i][k] + arr2[i][k]));
            }
        }
    }

}//class
