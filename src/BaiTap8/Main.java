package BaiTap8;

public class Main {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        IncrementThread incrementThread = new IncrementThread(sharedData);
        DecrementThread decrementThread = new DecrementThread(sharedData);

        Thread thread1 = new Thread(incrementThread);
        Thread thread2 = new Thread(decrementThread);

        thread1.start();
        thread2.start();
    }
}
