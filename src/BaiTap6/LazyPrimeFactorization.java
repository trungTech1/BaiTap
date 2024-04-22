package BaiTap6;

public class LazyPrimeFactorization implements Runnable{
    private final int n;

    public LazyPrimeFactorization(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println("LazyPrimeFactorization: " + i);
            }
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}