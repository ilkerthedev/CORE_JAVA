package smallstudy.methodcreationobjectcreation23;

public class School {


    //class member
    String okulIsmi="Yildiz kolej";
    boolean isActive=true;
    int yil=2022;

    public static void okulIsimi(String okulIsmi){
        System.out.println(okulIsmi);

    }

    public int yilYazdir(int yil){
        return yil;
    }

    public static void main(String[] args) {


        okulIsimi("Start okulu");
    }





}
