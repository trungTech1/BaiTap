package BaiTap11;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder(10000);
        Thread primeThread = new Thread(primeNumberFinder);
        primeThread.start();
        try {
            primeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Integer> primes = primeNumberFinder.getPrimes();
        System.out.println("Prime numbers: " + primes);
    }
}