class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int n = arr.length;
        int count = 0;
        
        for(int i=0; i<n-2; i++) {
            int left = i + 1;
            int right = n -1 ;
            
            while(left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                
                if(sum == target) {
                    
                    if(arr[left] == arr[right]) {
                        int len = right - left + 1;
                        count +=(len * (len - 1) / 2);
                        break;
                    }
                    
                        int leftVar = arr[left];
                        int rightVar = arr[right];
                        int leftCount = 0;
                        int rightCount = 0;
                        
                        while(left < right  && arr[left] == leftVar) {
                            leftCount++;
                            left++;
                        }
                        
                        while(right >= left && arr[right] == rightVar) {
                            rightCount++;
                            right--;
                        }
                        
                        count += leftCount * rightCount;
                }
                
                else if(sum < target) {
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return count;
    }
}