class Solution {
    public boolean isPalinSent(String s) {
        // code here
        StringBuilder cleaned = new StringBuilder();
        
        for(char ch : s.toCharArray()) {
            if(Character.isLetterOrDigit(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }
        
        String str = cleaned.toString();
        String reversed = cleaned.reverse().toString();
        
        return str.equals(reversed);
    }
}