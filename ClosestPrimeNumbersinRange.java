public class ClosestPrimeNumbersinRange {
    public static int[] closestPrimes(int left, int right) {
        int[] result = new int[2];
        int minDiff = Integer.MAX_VALUE;
        int prevPrime = -1;
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                if (prevPrime != -1) {
                    int diff = i - prevPrime;
                    if (diff < minDiff) {
                        minDiff = diff;
                        result[0] = prevPrime;
                        result[1] = i;
                    }
                }
                prevPrime = i;
            }
        }
        return result;
    }

    public static boolean isPrime(int n) {
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
    public static void main(String[] args) {
        int left = 4;
        int right = 6;
        int[] result = closestPrimes(left, right);
        System.out.println("Closest primes: " + result[0] + " and " + result[1]);
    }
}