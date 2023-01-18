package advanced_practice.practice07;

public class Q03_Static_Sirket {
    //Basit bir şirket bütçesi kodu yazınız.
    public static void main(String[] args) {
        Sirket dep1 = new Sirket();
        dep1.kasadanButceyeParaAktar(1000);
        dep1.paraKazan(5000);
        System.out.println("dep1.depButcesi = " + dep1.depButcesi);
        System.out.println("Sirket.kasa = " + Sirket.kasa);

        Sirket.kasadanParaHarca(2500);
        System.out.println("Sirket.kasa = " + Sirket.kasa);

        dep1.depertmanHarcamasi(1000);
        System.out.println("dep1.depButcesi = " + dep1.depButcesi);

        Sirket dep2 = new Sirket();
        dep2.kasadanButceyeParaAktar(1000);
        dep2.kasadanButceyeParaAktar(100);
        System.out.println("dep2.depButcesi = " + dep2.depButcesi);
        System.out.println("Sirket.kasa = " + Sirket.kasa);
        System.out.println("dep1.depButcesi = " + dep1.depButcesi);


    }

}
