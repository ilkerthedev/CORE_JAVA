package smallstudy.methodcreationobjectcreation23;

public class SchoolRunner {

    public static void main(String[] args) {

        School obj=new School();
        System.out.println(obj.okulIsmi);
        System.out.println(obj.yil);
        System.out.println(obj.isActive);

        School.okulIsimi("Bahar okulu");
        System.out.println(obj.yilYazdir(2023));

        Calculator.bolme(12, 5);
        Calculator.cikarma(15, 6);
        Calculator.carpma(12, 6);
        Calculator.toplama(12, 6);

    }

}
