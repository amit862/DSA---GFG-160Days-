class Solution {
    public int[] singleNum(int[] arr) {
        // Code here
    int xor = 0;
    
    for(int num : arr) {
        xor ^= num;
    }
    int setBit = xor & (-xor);
    int x = 0; int y = 0;
    
    for(int num : arr) {
        if((num & setBit) != 0) {
            x ^=num;
        } else {
            y ^= num;
        }
    }
        
        if(x < y) 
        return new int[]{x,y};
        else 
        return new int[]{y,x};
    
    }
}