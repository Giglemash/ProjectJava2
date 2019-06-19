package Lesson_4;

class MainDeadLock {
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {
        DeadThreadOne one = new DeadThreadOne();
        one.start();
        DeadThreadTwo two = new DeadThreadTwo();
        two.start();
    }

    static class DeadThreadOne extends Thread {

        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread1 держит lock1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread1 ждет lock2");
                synchronized (lock2) {
                    System.out.println("Thread1 держит lock1 и lock2");
                }
            }
        }
    }

    static class DeadThreadTwo extends Thread {

        @Override
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread2 держит lock2...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread2 ждет lock1");
                synchronized (lock1) {
                    System.out.println("Thread2 держит lock1 и lock2");
                }
            }
        }

    }
}
