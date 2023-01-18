package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Variable olusturmak
        //Java cümlesi = Statement
        //Java'da eşittir "==" demektir.
        //Java'da = "assignment operator" dır. Sağdaki değeri alır soldaki kutuya(variable) koyar.
        //Java'da access modifier yazmazsanız "access modifier" "default" demektir.
        //Data Type + Variable Name ==> Variable Declaration
        //Assignment Operator(Atama Operatörü) + Variable degeri ==>Assignment
        //Eğer Variable Declaration yapar, Assignment yapmazsanız Java kendi değerlerini(default) koyar.
        //"default" değerler sayılar için "0"dır.
        //Data Type'ını yazınız  Variable ismini yazınız    Assignment Operator(Atama Operatörü)     Variable değeri    İngilizcedeki nokta gibi
                int                            age                                =                              13                      ;


        //String'lere verilen değerler çift tırnak içinde olmalıdır.
        // String'ler için "default value" "null" dır.
        String studentName = "Ali Can";

        /*
            Java'da temelde iki tip data vardır;
            1)primitive data type:
                char: Tek karakterler için kullanılan data tipi. A, x, ?, 5
                boolean: booleanlar sadece iki farklı değer alabilir; true veya false
                byte: -128 den +127 e kadar tamsayi değerleri için kullanılır.   (1 byte)
                short: -32.768 ile 32.767 arasındaki tamsayılar için kullanılır. (2 byte)
                int: -2,147,483,648 ile 2,147,483,647 arasındaki sayılar         (4 byte)
                long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasındaki sayılar içindir. (8 byte)
                float:
                 - double
            2)non-primitive data type

         */


        //Note: char data type'inda degerler tek tirnak içine konulmalidir.
        char isminIlkHarfi = 'I';


        boolean emeklimisin = false;


        byte studentAge = 17;


        short apartmentPopulation = 1200;


        int countryPopulation = 1864184648;


        //Note: Bir değer long ise sonuna "L"(tercih edilen) veya "l" konulur.
        long cellNumberInHumanBody = 453284653184569L;

        //Eğer long'a atadığınız değer int'lerin aralığında ise sonuna "L" koymaya gerek yok.
        long weightOfSun = 1234567;




    }

}
