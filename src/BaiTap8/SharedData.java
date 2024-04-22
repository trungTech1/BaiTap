package BaiTap8;

public class SharedData {
    private int value;
    public synchronized void increase() {
        value++;
        System.out.println("Increase: " + value);
    }
    public synchronized void decrease() {
        value--;
        System.out.println("Decrease: " + value);
    }
}
