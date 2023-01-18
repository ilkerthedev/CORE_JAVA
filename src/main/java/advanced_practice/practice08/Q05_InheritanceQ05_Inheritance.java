package advanced_practice.practice08;

public class Q05_InheritanceQ05_Inheritance {
    //Dairenin alanını hesalayan bir method oluşturunuz.(matematik işlemleri için inheritance kullanınız)

    public static void main(String[] args) {
        daireAlani(5);
    }

    static void daireAlani(int r){
        Daire d = new Daire();
        System.out.println("Dairenin Alani: "+d.carpma(d.piSayisi,d.karesiniAl(r)));
    }

}
