// User function Template for Java
class Solution {
    
    private final String[] below20 = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
        "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
        "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    
    private final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
        "Eighty", "Ninety"
    };
    String convertToWords(int n) {
        // code here
        if(n == 0) return "Zero";
        return helper(n).trim();
        
    }
    
    private String helper(int n) {
        String result = "";
        
        if(n < 20) {
            result = below20[n];
        }
        else if(n < 100) {
            result = tens[n / 10] + " " + helper(n % 10);
        }
        else if(n < 1000) {
            result = below20[n / 100] + " Hundred " + helper(n % 100);
        }
        else if(n < 1000000) {
            result = helper(n / 1000) + " Thousand " + helper(n % 1000);
        }
        else if(n < 1000000000) {
            result = helper(n / 1000000) + " Million " + helper(n % 1000000);
        }
        else {
            result = helper(n / 1000000000) + " Billion " + helper(n % 1000000000);
        }
        return result.trim();
    }
}