package BaiTap6;

public class TestIsPrime {
    public static void main(String[] args) {
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization(20);
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization(20);

        Thread optimizedThread = new Thread(optimizedPrimeFactorization);
        Thread lazyThread = new Thread(lazyPrimeFactorization);

        optimizedThread.start();
        lazyThread.start();
    }
}
