package Lesson_4.Shop;

public class ThreadDemo extends Thread {

    @Override
    public void run() {
        System.out.println(getName());
    }


    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.setPriority(1);
        t2.setPriority(8);

        t1.start();
        t2.start();

    }

}
