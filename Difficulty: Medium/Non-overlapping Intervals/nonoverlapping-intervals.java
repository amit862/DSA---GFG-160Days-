class Solution {
    public int minRemoval(int intervals[][]) {
        // code here
    Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
    
    int removeCount = 0;
    int prevEnd = intervals[0][1];
    
    for(int i = 1; i < intervals.length; i++) {
        if(intervals[i][0] < prevEnd) {
            removeCount++;
        } else {
            prevEnd = intervals[i][1];
        }
    }
    return removeCount;
    }
}
