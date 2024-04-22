package BaiTap2;

public class SumThread implements Runnable{
    private final int n;
    private int sum;

    public SumThread(int n) {
        this.n = n;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of 1 to " + n + " is " + sum);
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new SumThread(1000));
        thread.start();
    }
}
