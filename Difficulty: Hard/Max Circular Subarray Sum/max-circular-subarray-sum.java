class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
    int n = arr.length;    
    int totalSum = arr[0];
    int maxEnding = arr[0], maxSoFar = arr[0];
    int minEnding = arr[0], minSoFar = arr[0];
    
    for(int i=1; i<n; i++) {
        int x = arr[i];
        totalSum += x;
        
        //kadane for max subarray
        maxEnding = Math.max(x, maxEnding + x);
        maxSoFar = Math.max(maxSoFar, maxEnding);
        
        minEnding = Math.min(x, minEnding + x);
        minSoFar = Math.min(minSoFar, minEnding);
    }
    
    if(maxSoFar < 0) {
        return maxSoFar;
    }
    return Math.max(maxSoFar, totalSum - minSoFar);
    }
}
