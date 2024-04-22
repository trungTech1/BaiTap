package BaiTap11;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder implements Runnable {
    private final int max;
    private final List<Integer> primes;

    public PrimeNumberFinder(int max) {
        this.max = max;
        this.primes = new ArrayList<>();
    }

    @Override
    public void run() {
        for (int i = 2; i <= max; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> getPrimes() {
        return primes;
    }
}