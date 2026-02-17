class Solution {
    public void rotateclockwise(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle k > n

        reverse(arr, 0, n - 1);     // step 1
        reverse(arr, 0, k - 1);     // step 2
        reverse(arr, k, n - 1);     // step 3
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
