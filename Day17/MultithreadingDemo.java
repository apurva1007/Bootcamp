/**
 * Created by ruplaga on 7/31/2017.
 */
public class MultithreadingDemo {

    static int value = 0;

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            ValueTask valueTask = new ValueTask();
            Worker1 worker1 = new Worker1(valueTask);
            worker1.start();

            PrintTask printTask = new PrintTask();
            Worker2 worker2 = new Worker2(printTask);
            worker2.start();
        }
    }
}

class ValueTask implements Runnable {

    @Override
    public void run() {
       MultithreadingDemo.value++;
    }
}

class PrintTask implements Runnable {

    @Override
    public void run() {
        System.out.println(MultithreadingDemo.value);
    }
}

class Worker1 extends Thread {

    Runnable valueTask = null;

    public Worker1(Runnable valueTask) {
        this.valueTask = valueTask;
    }

    @Override
    public void run() {
        valueTask.run();
    }
}

class Worker2 extends Thread {
    Runnable printTask = null;

    public Worker2(Runnable printTask) {
        this.printTask = printTask;
    }

    @Override
    public void run() {
        printTask.run();
    }
}