package advanced_practice.practice09.overriding;

public class Memur extends Banka{

    @Override
    public double faizHesapla(double alinacakKredi) {
        return alinacakKredi*0.1;
    }
}
