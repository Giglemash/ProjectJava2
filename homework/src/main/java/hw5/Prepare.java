package hw5;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Prepare {
    private final CyclicBarrier waitForPrepare;
    private FinishNotifier finishNotifier;

    public Prepare(int carCount, FinishNotifier finishNotifier) {
        this.waitForPrepare = new CyclicBarrier(carCount + 1);
        this.finishNotifier = finishNotifier;
    }

    public Car createCar (Race race, int speed) {
        return new Car(race, speed, waitForPrepare, finishNotifier);
    }

    public void awaitingAllCarsStarted() {
        try {
            waitForPrepare.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}