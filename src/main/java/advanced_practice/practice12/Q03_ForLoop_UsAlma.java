package advanced_practice.practice12;

public class Q03_ForLoop_UsAlma {
    //Bir sayının istenen kuvvetini hesaplayan bir method yazınız.

    public static void main(String[] args) {

        System.out.println(kuvvetiniAl(0, 0));

    }

    public static double kuvvetiniAl(double sayi, int us) {
        double result = 1;
        for (int i = 0; i < Math.abs(us); i++) {
            result *= sayi;
        }
        return us > 0 ? result : 1/result;
    }
}
