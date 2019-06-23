package Lesson_1;

import java.util.ArrayList;

public class BoxUltimate<T, V> {
    private T obj1;
    private V obj2;

    public BoxUltimate(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public V getObj2() {
        return obj2;
    }

    public void setObj2(V obj2) {
        this.obj2 = obj2;
    }

    public void info() {
        System.out.println("type " + obj1.getClass().getName());
        System.out.println("type " + obj2.getClass());
    }
}

class MainUltimate {
    public static void main(String[] args) {

        BoxUltimate<Integer, String> twoGen = new BoxUltimate<>(555, "Hello!");
        twoGen.info();

//        BoxUltimate<String> wSt = new BoxUltimate<>("Hello");
//        BoxUltimate<Integer> wIn = new BoxUltimate<>(123);
//
////        wSt.info();
////        wIn.info();
//
//        System.out.println(wSt.getClass());
//        System.out.println(wIn.getClass());


       // wSt = wIn;

//        int x = 10;
//        x += wIn.getObj();
//        System.out.println(x);

//        int x = 10;
//        x += wSt.getObj();
//        System.out.println(x);
    }
}
