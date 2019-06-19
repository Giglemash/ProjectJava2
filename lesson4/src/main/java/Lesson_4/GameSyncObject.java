package Lesson_4;

public class GameSyncObject {
    static Object стул1 = new Object();
    static Object стул2 = new Object();

    public static void main(String[] args) {

        Thread чел1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("чел1 подошел к стулу1");
                synchronized (стул1) {
                    System.out.println("чел1 сел на стул1");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("чел1 встал со стула 1");
                }
            }
        });
        чел1.start();

        Thread чел2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("чел2 подошел к стулу1");
                synchronized (стул1) {
                    System.out.println("чел2 сел на стул1");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("чел2 встал со стула 1");
                }
            }
        });
        чел2.start();

        Thread чел3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("чел3 подошел к стулу2");
                synchronized (стул2) {
                    System.out.println("чел3 сел на стул2");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("чел3 встал со стула 2");
                }
            }
        });
        чел3.start();

    }


}
