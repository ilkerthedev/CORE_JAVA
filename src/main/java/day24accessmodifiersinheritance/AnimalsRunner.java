package day24accessmodifiersinheritance;

import day23datetimestringbuilder.Snake;
import dev02.dev02day02.GrandOOP;

public class AnimalsRunner {

    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.meow();
        myCat.drink();
        myCat.eat();

        Snake yourSnake = new Snake();
        yourSnake.tiss();
        yourSnake.eat();

    }

}
