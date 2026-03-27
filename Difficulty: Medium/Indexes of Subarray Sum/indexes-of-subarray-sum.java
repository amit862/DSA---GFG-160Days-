
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
    ArrayList<Integer> result = new ArrayList<>();
    
    int start = 0;
    int currentSum = 0;
    
    for(int end = 0; end < arr.length; end++) {
        currentSum += arr[end];
        
        while(currentSum > target && start <= end) {
            currentSum -= arr[start];
            start++;
        }
        
        if(currentSum == target) {
            result.add(start + 1);
            result.add(end + 1);
            return result;
        }
    }
    result.add(-1);
    return result;
    }
}
