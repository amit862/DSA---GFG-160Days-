class Solution {
    int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;

        for (int num : arr) {
            
            // Update largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            
            // Update only second largest
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}