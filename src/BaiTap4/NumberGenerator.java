package BaiTap4;

public class NumberGenerator implements Runnable{
    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+ " -Hashcode: "+this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        NumberGenerator ger1 = new NumberGenerator();
        NumberGenerator ger2 = new NumberGenerator();
        Thread thread1 = new Thread(ger1);
        Thread thread2 = new Thread(ger2);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
    }
}
