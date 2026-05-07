class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = arr.length;
        int maxRight = arr[n - 1];
        
        // Rightmost element is always a leader
        result.add(maxRight);
        
        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                result.add(arr[i]);
            }
        }
        
        // Reverse to maintain original order
        Collections.reverse(result);
        
        return result;
    }
}
