class Solution {
    static boolean isPrime(int n) {
        
        // Prime numbers are greater than 1
        if (n <= 1) {
            return false;
        }

        // Check divisibility from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}