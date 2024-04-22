package BaiTap7;

public class RandomNumber extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.println("Random number: " + randomNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        randomNumber.start();
    }
}
