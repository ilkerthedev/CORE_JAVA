package day32collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

    /*
        "Queue" larda ilk gelen ilk isleme girer.(First In First Out ==> FIFO)
         Bazen de son gelen ilk isleme girer.(Last In First Out ==> LIFO)
         "Deque" "Double Ended Queue" hem "FIFO" hem de "LIFO" icin kullanilir.

         "Queue" bir interface'dir, bu yuzden "constructor" i yoktur, dolayisiyla object olustururken "new" keyword'unden sonra kullanilamaz
          Data TYpe'i "Queue" olan bir object olusturmak icin "new" keyword'unden sonra i)LinkedList veya ii)PriorityQueue
          Class'lari kullanilabilir.

          "Queue" olustururken constructor olarak "PriorityQueue" kullanirsaniz, elemanlari kendi belirleyeceginiz kurala gore
          siralama hakkiniz olur.
     */

    public static void main(String[] args) {

        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("Milk");
        myQueue.add("Butter");
        myQueue.add("Jam");
        myQueue.add("Egg");
        myQueue.add("Luxury water");

        System.out.println(myQueue);// [Milk, Butter, Jam, Egg, Luxury water]

        //Retrieves and removes the "head of this queue", or returns "null" if this queue is empty.
        myQueue.poll();

        //Retrieves and removes the head of this queue.
        //This method differs from poll() only in that it throws an exception if this queue is empty.
        //Returns:the head of this queue
        myQueue.remove();

        //Retrieves, but does not remove, the head of this queue.
        //This method differs from peek only in that it throws an exception if this queue is empty.
        myQueue.element();

        //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        myQueue.peek();

        /*
            poll() ile remove() ikisi de ilk elemani siler ve size verir.
            poll() bos "Queue" lar icin "null" verir, remove() ise bos "Queue" lar icin "Exception" atar.
        */

        /*
            element() ile peek() ikisi de ilk elemani silmeden size verir.
            peek() bos "Queue" lar icin "null" verir, element() ise bos "Queue" lar icin "Exception" atar.
        */

        /*
        Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
        When using a capacity-restricted queue, this method is generally preferable to add,
        which can fail to insert an element only by throwing an exception.
        Returns: true if the element was added to this queue, else false
        Throws:
        ClassCastException – if the class of the specified element prevents it from being added to this queue
        NullPointerException – if the specified element is null and this queue does not permit null elements
        IllegalArgumentException – if some property of this element prevents it from being added to this queue
         */
        boolean r = myQueue.offer("Avocado");
        System.out.println(r);//true

        System.out.println(myQueue);// [Jam, Egg, Luxury water, Avocado]

        Queue<String> yourQueue = new PriorityQueue<>();
        yourQueue.add("Milk");
        yourQueue.add("Butter");
        yourQueue.add("Jam");
        yourQueue.add("Egg");
        yourQueue.add("Luxury water");
        System.out.println(yourQueue);//[Butter, Egg, Jam, Milk, Luxury water]
    }
}