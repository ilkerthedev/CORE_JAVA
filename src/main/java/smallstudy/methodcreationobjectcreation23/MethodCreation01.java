package smallstudy.methodcreationobjectcreation23;

public class MethodCreation01 {

    // string’i yazdiran method olusturalim
    // hosgeldiniz diyen bir method olusturun
    // kapanma mesaji yazn bir method olustur
    //degerli arkadaslar SSG dersimizde Hosgeldiniz
    //Ali can Bey
    // Iki saynini Bolma yapiniz
    //2//
    // Bizi tercih ettiginiz icin tesekkur ederiz

    public static void stringMethod(){
        System.out.println("degerli arkadaslar SSG dersimizde Hosgeldiniz");
    }

    public static void isimVeSoyIsimMethod(String isim, String soyIsim){
        System.out.println(isim +" "+soyIsim);
    }

    public static void stringYazdir (){
        System.out.println("Iki saynini Bolma yapiniz");
        Calculator.bolme(12, 6);
    }

    public static void kapanmaMethod(){
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }


    public static void main(String[] args) {

        stringMethod();
        isimVeSoyIsimMethod("Betul", "Coskun");
        isimVeSoyIsimMethod("Elif", "Sudu");
        stringYazdir();
        kapanmaMethod();

    }

}//class body
