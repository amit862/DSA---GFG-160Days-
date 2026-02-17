class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int k = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0) {
                arr[k++] = arr[i];
            }
        }
        
        while(k < arr.length) {
            arr[k++] = 0;
        }
    }
}