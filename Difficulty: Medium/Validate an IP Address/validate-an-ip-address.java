class Solution {
    public boolean isValid(String s) {
        
        // Split using dot
        String[] parts = s.split("\\.", -1);
        
        // IPv4 must have exactly 4 parts
        if (parts.length != 4) {
            return false;
        }
        
        for (String part : parts) {
            
            // Empty part is invalid
            if (part.length() == 0) {
                return false;
            }
            
            // Leading zeros are invalid
            if (part.length() > 1 && part.charAt(0) == '0') {
                return false;
            }
            
            // Check all characters are digits
            for (char ch : part.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    return false;
                }
            }
            
            // Convert to number
            int num = Integer.parseInt(part);
            
            // Range check
            if (num < 0 || num > 255) {
                return false;
            }
        }
        
        return true;
    }
}