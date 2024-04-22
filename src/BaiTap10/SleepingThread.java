package BaiTap10;

import java.util.Scanner;

public class SleepingThread implements Runnable {
    private final long sleepTime;

    public SleepingThread(long sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread is going to sleep for " + sleepTime + " seconds.");
            Thread.sleep(sleepTime * 1000);
            System.out.println("Thread woke up after sleeping for " + sleepTime + " seconds.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of seconds for the thread to sleep:");
        long sleepTime = scanner.nextLong();
        Thread thread = new Thread(new SleepingThread(sleepTime));
        thread.start();
    }
}