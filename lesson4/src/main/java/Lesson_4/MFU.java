package Lesson_4;

public class MFU {

    Object printLock = new Object();
    Object scanLock = new Object();

    public void print(String doc, int n) {
        synchronized (printLock) {

        }

    }

    public void scan(String doc, int n) {
        synchronized (scanLock) {

        }
    }

    public static void main(String[] args) {
        MFU mfu = new MFU();

        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.print("myDoc", 2);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.print("myDoc1", 3);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.scan("myDoc2", 2);
            }
        }).start();
    }
}
