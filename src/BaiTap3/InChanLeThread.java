package BaiTap3;

public class InChanLeThread implements Runnable{
    private final int n;
    private final boolean isEven;

    public InChanLeThread(int n, boolean isEven) {
        this.n = n;
        this.isEven = isEven;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            if (isEven && i % 2 == 0) {
                System.out.printf("So chan thu %d: %d\n", i / 2, i);
            } else if (!isEven && i % 2 != 0) {
                System.out.printf("So le thu %d: %d\n", i / 2 + 1, i);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new InChanLeThread(10, true));
        Thread thread2 = new Thread(new InChanLeThread(10, false));
        thread1.start();
        thread2.start();
    }
}
