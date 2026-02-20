class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        //step1: If lengths are different, cannot be anagrams
        if(s1.length() != s2.length()) {
            return false;
        }
        
        //step2: Create frequency array for 26 Lowercase letter
        int[] freq = new int[26];
        
        
        //step3: Count Characters
        for(int i=0; i<s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        
        
        //step4: check if all counts are zero
        for(int count:freq) {
            if(count != 0) {
                return false;
            }
        }
        
        return true;
        
    }
}