package advanced_practice.practice07;

public class Sirket {

    static int kasa;
    int depButcesi;


    public void kasadanButceyeParaAktar(int alinacakPara){
        depButcesi += alinacakPara;
        kasa -= alinacakPara;
        System.out.println("Kasa'dan "+alinacakPara+" TL alindi.");
    }

    public void paraKazan(int kazanilanPara){
        kasa += kazanilanPara;
        System.out.println(kazanilanPara+" TL kasa'ya eklendi.");
    }

    public static void kasadanParaHarca(int harcanacakPara){
        kasa-=harcanacakPara;
        System.out.println("Kasa'dan "+harcanacakPara+" TL harcandi.");
    }

    public void depertmanHarcamasi(int harcanacakPara){
        depButcesi -= harcanacakPara;
        System.out.println("Departman butcesinden "+harcanacakPara+" TL harcandi.");
    }

}
