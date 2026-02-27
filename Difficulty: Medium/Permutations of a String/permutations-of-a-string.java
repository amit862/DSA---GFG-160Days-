class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> result = new ArrayList<>();
        
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        
        boolean[] used = new boolean[chars.length];
        backtrack(chars, used, new StringBuilder(), result);
        
        return result;
        
    }
    
    public void backtrack(char[] chars, boolean[] used, StringBuilder current, ArrayList<String> result) {
       
        if(current.length() == chars.length) {
            result.add(current.toString());
            return;
        }
        
        for(int i = 0; i < chars.length; i++) {
            if(used[i]) continue;
            
            if(i > 0 && chars[i] == chars[i - 1] && !used[i - 1])
            continue;
            
            used[i] = true;
            current.append(chars[i]);
            
            backtrack(chars, used, current, result);
            
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }
}