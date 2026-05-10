
class Solution {
    String reverseWords(String s) {
        
        // Split using one or more dots
        String[] words = s.split("\\.+");
        
        StringBuilder result = new StringBuilder();
        
        // Traverse in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            
            // Ignore empty strings
            if (!words[i].isEmpty()) {
                
                if (result.length() > 0) {
                    result.append(".");
                }
                
                result.append(words[i]);
            }
        }
        
        return result.toString();
    }
}