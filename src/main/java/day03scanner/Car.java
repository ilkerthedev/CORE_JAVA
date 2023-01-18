package day03scanner;

public class Car {

    // Class ==> Variable (Field) ==> Object Creation
    //           Method (Function)

    //*Variables*
    public String model = "Corolla";
    public int fiyat = 200000;


    public static void main(String[] args) {

        //***Object Creation***
        //Class ismini yazın - Objeye isim verin - = - new keywordu - Class ismini () ile kullanın

               Car                myCorolla        =      new                  Car();

        //Variables
        System.out.println(myCorolla.fiyat);
        System.out.println(myCorolla.model);
        //Methods
        myCorolla.hareket();
        myCorolla.dur();


    }//main'in bodysi

    //*Methods*
    public void hareket() {

        System.out.println("Toyota hızlı hareket eder...");

    }

    public void dur() {

        System.out.println("Toyota güvenle durur...");

    }


}//class bodysi
