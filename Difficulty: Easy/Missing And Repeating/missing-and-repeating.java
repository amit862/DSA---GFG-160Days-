class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        long sumN = (long) n * (n + 1) / 2;
        long sumSqN = (long) n * (n + 1) * (2L * n + 1) / 6;
        
        long actualSum = 0;
        long actualSqSum = 0;
        
        for (int num : arr) {
            actualSum += num;
            actualSqSum += (long) num * num;
        }
        
        // x = repeating, y = missing
        long diff = actualSum - sumN; // x - y
        
        long sqDiff = actualSqSum - sumSqN; // x² - y²
        long sum = sqDiff / diff; // x + y
        
        long repeating = (diff + sum) / 2;
        long missing = sum - repeating;
        
        result.add((int) repeating);
        result.add((int) missing);
        
        return result;
    }
}
