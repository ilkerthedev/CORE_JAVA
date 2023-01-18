package day02datatypesmethodcreation;

public class Assigment {

    public static void main(String[] args) {

        double dikdortgenAlan = areaRectangle(5, 10);
        System.out.println(dikdortgenAlan);

        long dikdortgenCevre = perimeterRectangle(5, 10);
        System.out.println(dikdortgenCevre);

        double daireCevre = perimeterCircle(10);
        System.out.println(daireCevre);

        double daireAlan = areaCircle(2);
        System.out.println(daireAlan);



    }//mainbody

    public static double areaRectangle(double a,double b){

        return  a*b;

    }

    protected static long perimeterRectangle(int a, int b){

        return 2*a + 2*b;

    }

    static double perimeterCircle(double r){

        double π = 3.14 ;

        return 2*π*r;

    }

    private static double areaCircle(double r){

        double π = 3.14 ;

        return π*r*r;

    }


}
