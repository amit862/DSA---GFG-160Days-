class Solution {
    int missingNum(int arr[]) {
        long n = arr.length + 1;

        long expectedSum = n * (n + 1) / 2;
        long actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return (int)(expectedSum - actualSum);
    }
}