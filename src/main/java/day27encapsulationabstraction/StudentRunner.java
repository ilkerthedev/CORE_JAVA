package day27encapsulationabstraction;

public class StudentRunner {

    public static void main(String[] args) {

        Student myStd = new Student();

        //Student 1
        System.out.println(myStd.getStdId());//AC123
        System.out.println(myStd.getGpa());
        System.out.println(myStd.isPoor());

        //Student 2
        myStd.setStdId("TH123");
        myStd.setGpa(4.0);             //Encapsulation yapilmis variable'i setter ile degistirdik, artik student 2 gibi kullanilabilir
        myStd.setPoor(false);          // memory'den tasarruf edilmis olur.

    }

}
