package BaiTap6;

public class OptimizedPrimeFactorization implements Runnable{
    private final int n;

    public OptimizedPrimeFactorization(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println("OptimizedPrimeFactorization: " + i);
            }
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
