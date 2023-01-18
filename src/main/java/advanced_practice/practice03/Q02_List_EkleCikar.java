package advanced_practice.practice03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {

    //Kullanıcıdan aldığınız bir sayıyı bir list'e ekleyen,
    // list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true){
            System.out.println("Ekleme yapmak için: 'add'\n"+
                                "Element güncellemek için: 'set'\n"+
                                "Element silmek için: 'remove'\n"+
                                "Çıkmak için: 'break' komutunu giriniz.");

            String komut = input.next();

            if (komut.equalsIgnoreCase("add")){
                System.out.println("Eklemek istediginiz tamsayiyi giriniz.");
                int eklenecekSayi = input.nextInt();
                list.add(eklenecekSayi);
            }else if (komut.equalsIgnoreCase("set")){
                System.out.println("Guncellemek istediginiz sayıyı giriniz.");
                int guncellenmekIstenenSayi = input.nextInt();
                int guncellenecekIndex =  list.indexOf(guncellenmekIstenenSayi);
                System.out.println(guncellenmekIstenenSayi+", yerine eklemek istediginiz sayiyi giriniz.");
                int guncellenecekSayi = input.nextInt();
                list.set(guncellenecekIndex, guncellenecekSayi);
            }else if (komut.equalsIgnoreCase("remove")){
                System.out.println("Silmek istediginiz sayiyi giriniz.");
                Integer silinecekSayi = input.nextInt();
                list.remove(silinecekSayi);
            }else if(komut.equalsIgnoreCase("break")){
                break;
            }else System.out.println("Lutfen gecerli bir komut giriniz.");

            System.out.println(list);
        }//while loop
        System.out.println("Gule gule");
        System.out.println("list = " + list);

    }//main

}//class
