package BaiTap8;

public class DecrementThread implements Runnable{
    private final SharedData sharedData;

    public DecrementThread(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedData.decrease();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
