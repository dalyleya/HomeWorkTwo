package ua.sourceit.javabasic.task2.vector;

/**
 * Created by user on 08.08.2015.
 */
public class Runner {
    public static void main(String[] args) {
        MyVector vec = new MyVector(1);
        for (int i = 0; i < 100; i++) {
            vec.addElement(i);
        }
        vec.print();
        vec.clear();
        System.out.println("-----------------------------------------------");
        vec.print();
    }

}

