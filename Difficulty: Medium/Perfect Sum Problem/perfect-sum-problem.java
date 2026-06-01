class Solution {
    int perfectSum(int[] arr, int target) {
        int mod = 1000000007;

        long[] dp = new long[target + 1];
        dp[0] = 1;

        for (int num : arr) {
            for (int j = target; j >= num; j--) {
                dp[j] = (dp[j] + dp[j - num]) % mod;
            }
        }

        return (int) dp[target];
    }
}