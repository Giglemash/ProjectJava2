package Lesson_4.Race;

public class TestS {

    public synchronized static void m1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized static void m2() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TestThreadStatic {
    public static void main(String[] args) {
        TestS s1 = new TestS();
        TestS s2 = new TestS();

        new Thread(new Runnable() {
            @Override
            public void run() {
                s1.m1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                s2.m2();
            }
        }).start();
    }
}
