class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        //if only one tower, difference is 0
        if (n == 0)
        return 0;
        
        //Step 1 sort the array
       Arrays.sort(arr);
        
        //Step 2 Initilize difference
        int ans = arr[n - 1] - arr[0];
        
        //Step 3 Travarse and try every partition
        for(int i = 0; i < n - 1; i++) {
            
            // If decreasing makes height negative, skips
            if(arr[i + 1] - k < 0)
            continue;
            
            int minHeight = Math.min(arr[0] + k, arr[i + 1] - k);
            int maxHeight = Math.max(arr[i] + k, arr[n - 1] - k);
            
            ans= Math.min(ans, maxHeight - minHeight);
        }
        
        return ans; 
        
    }
}




