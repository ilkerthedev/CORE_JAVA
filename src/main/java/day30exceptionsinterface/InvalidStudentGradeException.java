package day30exceptionsinterface;

    /*
        1)Kendi application'iniza ozel kurallar olusturmak icin kendi "Exception Class" larinizi olusturabilirsiniz.
        2)Olusturdugunuz "Exception Class" lar i)Compile Time Exception ii)Run Time Exception
        3)Compile Time Exception olusturmak icin class'inizin parent'i "Exception Class" olmalidir.
        4)Run Time Exception olusturmak icin class'inizin parent'i "RunTimeException Class" olmalidir.
        5)Kendi olusturdugumuz Exception Class'lara "Custom Exception Class" denir.
     */

public class InvalidStudentGradeException extends Exception {

    public InvalidStudentGradeException(String message){
        super(message);
    }

}
