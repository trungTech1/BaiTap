package BaiTap1;

public class PrintThread implements Runnable {

    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Countdown finished!");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new PrintThread());
        thread.start();
    }
}
