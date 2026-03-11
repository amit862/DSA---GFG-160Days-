// User function Template for Java
class Solution {
    public int findDuplicate(int[] arr) {
        // code here
        int n = arr.length;
        
        int actualSum = 0;
        for(int num : arr) {
            actualSum += num;
        }
        
        long expectedSum = (long)n * (n - 1) / 2;
        
        return (int) (actualSum - expectedSum);
    }
}