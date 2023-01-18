package day26overriding;

public class Cat extends Mammal {

    public void meow(){
        System.out.println("Cats meow");
    }

    @Override //Override Annotation: Override kurallarinin Java tarafindan kontrol edilmesini saglar
    public void eat() { // Child'daki override edilmis eat() method'una "Overriding Method" denir.
        System.out.println("Cats eat");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink");
    }

    @Override
    public Animal create() {
        return new Cat();
    }// new Cat() ==> Cat olusturduk. Cat bir Animal oldugu icin olusturdugumuz Cat'i Animal data type'ina koyabiliriz.

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }
}
